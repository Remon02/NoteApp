import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.Typography
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = Color(0xFF121212), // Dark Gray
    onBackground = Color.White,
    surface = Color(0xFF03A9F4), // Light Blue
    onSurface = Color(0xFF121212) // Dark Gray
)

// ✅ لازم نعرف Typography بشكل صحيح
private val AppTypography = Typography()

// ✅ لازم نعرف Shapes بنفسنا لأن Material2 مش بيحتوي عليه كـ Object جاهز
private val AppShapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(16.dp)
)

@Composable
fun NoteAppTheme(darkTheme: Boolean = true, content: @Composable () -> Unit) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = AppTypography, // استخدم Typography الصحيح
        shapes = AppShapes,         // استخدم Shapes الصحيح
        content = content
    )
}
