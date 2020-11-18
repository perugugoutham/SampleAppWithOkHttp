package com.perugu.goutham.sampleappwithokhttp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class SampleAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.image_view)
        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView)

    }
}