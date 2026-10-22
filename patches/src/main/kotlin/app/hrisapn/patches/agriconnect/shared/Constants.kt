package app.hrisapn.patches.agriconnect.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_AGRICONNECT = Compatibility(
        name = "AgriConnect",
        packageName = "com.git.agriconnect",
        apkFileType = ApkFileType.APK,
        appIconColor = 0xFFF46C09,
        targets = listOf(
            // Developed against versionName 1.0.2 / versionCode 6.
            AppTarget(version = "1.0.2"),
        ),
    )
}
