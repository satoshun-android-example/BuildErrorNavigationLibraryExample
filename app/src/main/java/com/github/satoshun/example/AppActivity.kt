package com.github.satoshun.example

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.github.satoshun.example.feature.sub1.Sub1FragmentArgs

class AppActivity : BaseActivity() {
  private lateinit var navController: NavController
  private lateinit var appBarConfiguration: AppBarConfiguration

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.app_act)

    navController = Navigation.findNavController(this, R.id.nav_fragment)
    appBarConfiguration = AppBarConfiguration(navController.graph)

    setupActionBarWithNavController(navController, appBarConfiguration)
  }

  override fun onSupportNavigateUp(): Boolean =
    navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
}
