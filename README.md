# NavigationDemo
NavigationDemo


 project：
 
 
   ext.nav_version = "1.0.0-alpha01"
  
  
    repositories {
        google()
        jcenter()
    }
    
    dependencies {
        classpath 'com.android.tools.build:gradle:3.2.0-alpha16'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        classpath "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0-alpha01"
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
    
      App:
      apply plugin: "androidx.navigation.safeargs"
     implementation "android.arch.navigation:navigation-fragment:$nav_version" // use -ktx for Kotlin
    implementation "android.arch.navigation:navigation-ui:$nav_version" // use -ktx for Kotlin
    
    
    
    用As3.2 Gradle 4.6
