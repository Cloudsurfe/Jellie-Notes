pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://androidx.dev/snapshots/builds/13508953/artifacts/repository")
        }
    }
    buildscript{
        repositories{
            maven {
                url = uri("https://storage.googleapis.com/r8-releases/raw/main")
            }
        }
        dependencies{
            classpath("com.android.tools:r8:dc2a45cbda6abd6b740e87e40ead3442e6e164b2")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://androidx.dev/snapshots/builds/13508953/artifacts/repository")
        }
    }
}

rootProject.name = "JellieNotes"
include(":app")
include(":baselineprofile")
include(":editor")
include(":plugins")
include(":runtime")
