import com.danilp.buildsrc.Deps

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
}

android {
    namespace = "com.danilp.professionalaquaristmobileapp.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.danilp.professionalaquaristmobileapp.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

ktlint {
    android.set(true)
    ignoreFailures.set(false)
    disabledRules.set(mutableListOf("no-wildcard-imports"))
    reporters {
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.PLAIN)
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.SARIF)
    }
}

dependencies {
    implementation(project(":shared"))

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("androidx.activity:activity-compose:1.6.1")

    with(Deps.Compose) {
        implementation(ui)
        implementation(uiPreview)
        implementation(viewModel)
        implementation(material3)
        implementation(animation)
        implementation(foundation)
        implementation(foundationLayout)
        implementation(icons)
        implementation(navigation)
        implementation(uiController)
        implementation(flowLayout)
        androidTestImplementation(unitTest)
        debugImplementation(debugTest)
        debugImplementation(debugTooling)
    }

    implementation("com.github.skydoves:landscapist-glide:1.6.1")

    with(Deps.Coroutines) {
        implementation(core)
        implementation(android)
    }

    debugImplementation("com.squareup.leakcanary:leakcanary-android:2.9.1")
}
