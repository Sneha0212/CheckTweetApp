package com.checker.checktweetapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.checker.checktweetapp.Fragments.MainActivityFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val mainFragment = MainActivityFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, mainFragment)

        transaction.commit()
    }

}
