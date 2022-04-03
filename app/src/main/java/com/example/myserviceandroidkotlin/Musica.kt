package com.example.myserviceandroidkotlin

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.media.audiofx.BassBoost
import android.os.IBinder
import android.provider.Settings.System.DEFAULT_RINGTONE_URI
import android.widget.Toast


class Musica : Service() {

    private lateinit var myPlayer: MediaPlayer;

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //reproductor = MediaPlayer.create(this, R.raw.himno_ugb);
        //reproductor.start()
        Toast.makeText(this, "Your Service is created", Toast.LENGTH_LONG).show();
        myPlayer = MediaPlayer.create(this, R.raw.himno_ugb);
        myPlayer.setLooping(true)
         myPlayer.start()
    return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        myPlayer.stop();
        Toast.makeText(this, "Your Service stopped", Toast.LENGTH_LONG).show();
    }

}