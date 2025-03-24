package eu.tutorials.noteapp.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import eu.tutorials.noteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("Select * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteId(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE) // lo git ad5l haga mogoda asln fe el database hi3ml update bs
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}