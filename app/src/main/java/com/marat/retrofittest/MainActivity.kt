package com.marat.retrofittest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marat.retrofittest.ui.fragments.listfragment.CharacterListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragment_container_view, CharacterListFragment()).commit()
    }
}