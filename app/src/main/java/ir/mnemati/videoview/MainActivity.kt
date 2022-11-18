package ir.mnemati.videoview

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    private lateinit var md: MediaController
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPlay:Button = findViewById(R.id.button_play)
        val videoSHow: VideoView = findViewById(R.id.videoView_main)

        buttonPlay.setOnClickListener {

            val urlPath = "https://hajifirouz7.cdn.asset.aparat.com/aparat-video/936b1433ed817a19c02487fe07ee743948795656-360p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjBkYWUxNGRjNDA3OGM4ZmIwYTgyMjhjYzFhZjlmYTRmIiwiZXhwIjoxNjY4ODA3MDc4LCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.iwas-hFSF2kf65Dbwrm2hs_2-5OzAAsNhuXbOuynSp4"
            //videoSHow.setVideoPath(urlPath)
            videoSHow.setVideoURI(Uri.parse(urlPath));
            videoSHow.start()
        }

    }
}