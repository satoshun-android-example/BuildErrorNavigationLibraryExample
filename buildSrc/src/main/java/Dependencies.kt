object Vers {
  const val compile_sdk = 28
  const val min_sdk = 21
  const val target_sdk = 28

  const val kotlin = "1.3.11"
}

object Libs {
  const val android_plugin = "com.android.tools.build:gradle:3.4.0-alpha10"
  const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"

  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"

  const val ktx = "androidx.core:core-ktx:1.1.0-alpha03"

  const val appcompat = "androidx.appcompat:appcompat:1.1.0-alpha01"
  const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0-alpha01"
  const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha3"
  const val cardview = "androidx.cardview:cardview:1.0.0"
  const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0-alpha01"

  const val activityx = "androidx.activity:activity-ktx:1.0.0-alpha03"
  const val fragmentx = "androidx.fragment:fragment-ktx:1.1.0-alpha03"

  private const val vnavigation = "1.0.0-alpha09"
  const val NAVIGATION = "android.arch.navigation:navigation-common-ktx:$vnavigation"
  const val navigation_fragment = "android.arch.navigation:navigation-fragment-ktx:$vnavigation"
  const val navigation_runtime = "android.arch.navigation:navigation-runtime-ktx:$vnavigation"
  const val navigation_ui = "android.arch.navigation:navigation-ui-ktx:$vnavigation"
  const val navigation_safeargs_plugin = "android.arch.navigation:navigation-safe-args-gradle-plugin:$vnavigation"
}
