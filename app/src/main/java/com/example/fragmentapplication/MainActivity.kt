package com.example.fragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = (supportFragmentManager.
            findFragmentById(R.id.fragmentContainerView3) as NavHostFragment)
            .navController
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragmentContainerView, FragmentOne())
//                .commit()
//        }
        val swtch = findViewById<Switch>(R.id.switch1)
        swtch.setOnCheckedChangeListener { _, isChecked ->
            if (!isChecked) {
                navController.navigate(R.id.action_fragmentTwo_to_fragmentOne)
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragmentContainerView, FragmentOne())
//                    .commit()
            } else {
                navController.navigate(R.id.action_fragmentOne_to_fragmentTwo)
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragmentContainerView, FragmentTwo())
//                    .commit()
            }
        }
    }
}