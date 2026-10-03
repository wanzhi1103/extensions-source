import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "LoveMeizi"
    versionCode = 1
    contentWarning = ContentWarning.NSFW
    libVersion = "1.6"

    source {
        name = "lovemeizi"
        lang = "zh"
        baseUrl = "https://www.lovecutes.com"
    }
}
