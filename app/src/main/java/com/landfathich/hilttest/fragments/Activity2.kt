    package com.landfathich.hilttest.fragments

    import android.os.Bundle
    import android.util.Log
    import androidx.appcompat.app.AppCompatActivity
    import androidx.core.view.WindowCompat
    import androidx.navigation.findNavController
    import androidx.navigation.ui.AppBarConfiguration
    import androidx.navigation.ui.navigateUp
    import androidx.navigation.ui.setupActionBarWithNavController
    import com.google.android.material.snackbar.Snackbar
    import com.landfathich.hilttest.R
    import com.landfathich.hilttest.WiFiManager
    import com.landfathich.hilttest.databinding.Activity2Binding
    import dagger.hilt.android.AndroidEntryPoint
    import javax.inject.Inject

    @AndroidEntryPoint
    class Activity2 : AppCompatActivity() {

        @Inject
        lateinit var wiFiManager: WiFiManager

        private lateinit var appBarConfiguration: AppBarConfiguration
        private lateinit var binding: Activity2Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
            super.onCreate(savedInstanceState)

            Log.d("TEST", "Activity2 instance id: $wiFiManager")

            binding = Activity2Binding.inflate(layoutInflater)
            setContentView(binding.root)

            setSupportActionBar(binding.toolbar)

            val navController = findNavController(R.id.nav_host_fragment_content_2)
            appBarConfiguration = AppBarConfiguration(navController.graph)
            setupActionBarWithNavController(navController, appBarConfiguration)

            binding.fab.setOnClickListener { view ->
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAnchorView(R.id.fab)
                    .setAction("Action", null).show()
            }
        }

        override fun onSupportNavigateUp(): Boolean {
            val navController = findNavController(R.id.nav_host_fragment_content_2)
            return navController.navigateUp(appBarConfiguration)
                    || super.onSupportNavigateUp()
        }
    }