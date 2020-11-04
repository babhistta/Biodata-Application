package com.example.biodata

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBiodata= findViewById<Button>(R.id.btnbiodata)
        val buttonAlamat= findViewById<Button>(R.id.btnalamat)
        val buttonEmail= findViewById<Button>(R.id.btnemail)

        buttonBiodata.setOnClickListener {
            val intent = Intent(this, biodatafull::class.java)
            // start your next activity
            startActivity(intent)
        }

        buttonAlamat.setOnClickListener{
            val gmmIntentUri = Uri.parse("https://goo.gl/maps/K7qaBNYvis2p5WAN7")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        buttonEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto: babhistta@gmail.com")
            startActivity(intent)
        }

    }

    fun call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "6289696873420")
        startActivity(dialIntent)
    }


}