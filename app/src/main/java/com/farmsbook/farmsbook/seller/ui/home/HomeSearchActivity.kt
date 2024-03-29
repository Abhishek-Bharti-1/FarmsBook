package com.farmsbook.farmsbook.seller.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.farmsbook.farmsbook.databinding.ActivityHomeSearchBinding

class HomeSearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeSearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.searchBtn.setOnClickListener {
            Toast.makeText(this,"Clicked Search Button",Toast.LENGTH_SHORT).show();
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}