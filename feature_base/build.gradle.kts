plugins{
    id(GradlePluginId.androidApplication)
}

android {
    compileSdkVersion(ApplicationConfig.compileSdkVersion)


    defaultConfig {
        minSdkVersion(ApplicationConfig.minSdkVersion)
        targetSdkVersion(ApplicationConfig.targetSdkVersion)
        versionCode = 1
        versionName = "${ApplicationConfig.versionName}"

        testInstrumentationRunner = ApplicationConfig.testInstrumentationRunner

    }


}

dependencies {
    //implementation fileTree(dir: 'libs', include: ['*.jar'])

    implementation( "com.android.support:appcompat-v7:28.0.0")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("com.android.support.test:runner:1.0.2")
    androidTestImplementation ("com.android.support.test.espresso:espresso-core:3.0.2")
}