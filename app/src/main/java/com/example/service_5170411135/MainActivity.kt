package com.example.service_5170411135

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/langitinspirasi"))
            startActivity(i)
        })
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/langitinspirasi.co.id"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.hmp)

        btn_ply.setOnClickListener{MediaPlayer?.start()}
        btn_pause.setOnClickListener{MediaPlayer?.pause()}
        btn_stop.setOnClickListener{MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)}
    }
}
