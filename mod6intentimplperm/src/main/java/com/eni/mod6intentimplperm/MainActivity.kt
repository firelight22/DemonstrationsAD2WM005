package com.eni.mod6intentimplperm

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


const val RC_SEND_SMS = 564

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonViewSMS = findViewById<Button>(R.id.buttonViewSMS)
        val buttonSendSMS = findViewById<Button>(R.id.buttonSendSMS)
        buttonViewSMS.setOnClickListener {
            val intentView = Intent(Intent.ACTION_VIEW, Uri.parse("sms:31415"))
            startActivity(intentView)
        }
        buttonSendSMS.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                RC_SEND_SMS
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == RC_SEND_SMS){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                val intentView = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:0612345678"))
                intentView.putExtra("sms_body","Hello je suis oui")
                startActivity(intentView)
            }
        }
    }
}