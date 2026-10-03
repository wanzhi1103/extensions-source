import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "LoveMeizi"
    versionCode = 0
    contentWarning = ContentWarning.NSFW
    libVersion = "1.6"
    theme = "default"

    source {
        lang = "zh"
        baseUrl = "https://www.lovecutes.com"
    }
}
