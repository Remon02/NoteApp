plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hilt.android)  // ✅ تصحيح إضافة Hilt
    id("kotlin-kapt")  // ✅ مهم لـ KAPT
}

android {
    namespace = "eu.tutorials.noteapp"
    compileSdk = 35  // ✅ خليها 34 لأن 35 مش رسمي حتى الآن

    defaultConfig {
        applicationId = "eu.tutorials.noteapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation("androidx.compose.material:material:1.5.0")

    // AndroidX & Compose
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Compose dependencies
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")  // ✅ إصدار ثابت
    implementation("androidx.navigation:navigation-compose:2.7.6")  // ✅ إصدار حديث
    implementation("androidx.compose.material:material-icons-extended:1.6.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")  // ✅ إصدار أحدث
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")

    // Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.50")  // ✅ أحدث إصدار
    kapt("com.google.dagger:hilt-android-compiler:2.50")  // ✅ أحدث إصدار
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // Room (Database)
    implementation("androidx.room:room-runtime:2.6.1")  // ✅ إصدار محدث
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")  // ✅ دعم Kotlin
}
