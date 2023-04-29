package com.example.binding

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding  // this is used to create class for xml file which take  all the view as attribute
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            var message = binding.edittext.text.toString()
            binding.display.text=message
        }
        binding.button2.setOnClickListener {
            var intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.cardview.setOnClickListener {
            var intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.android.com/develop/ui/views/notifications/snackbar/showing")
            startActivity(intent)
        }



    }
}