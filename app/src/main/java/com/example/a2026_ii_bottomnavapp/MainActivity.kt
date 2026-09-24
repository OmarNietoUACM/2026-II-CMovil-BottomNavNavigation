package com.example.a2026_ii_bottomnavapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    //Guia https://github.com/material-components/material-components-android/blob/master/docs/components/BottomNavigation.md
    val homeFragment = HomeFragment()
    val notificacionesFragment = NotificacionFragment()
    val settingFragment = SettingFragment()

    lateinit var bottonBar: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottonBar = findViewById<BottomNavigationView>(R.id.botton_nav)


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.contenedor, homeFragment)
            .commit()

        //Agrega un pequeño número en el ícono
        val badge = bottonBar.getOrCreateBadge(R.id.notificacion)
        badge.number = 9
        badge.setVisible(true)

        bottonBar.setOnItemSelectedListener { menuIntem ->

            when(menuIntem.itemId){
                R.id.home -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.contenedor, homeFragment)
                        .commit()
                    true
                }
                R.id.notificacion -> {

                            val badge = bottonBar.getBadge(R.id.notificacion)
                            if (badge != null)
                            {
                                badge.setVisible(false)
                                badge.clearNumber()
                                bottonBar.removeBadge(R.id.notificacion)
                            }
                            supportFragmentManager
                                .beginTransaction()
                                .replace(R.id.contenedor, notificacionesFragment)
                                .commit()

                            true
                        }
                R.id.configuracion ->
                {supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.contenedor, settingFragment)
                        .commit()
                true
                }
                else -> false
            }

        }

    }
}