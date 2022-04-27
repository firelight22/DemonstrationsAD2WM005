package com.eni.mod6tpintent

import android.Manifest
import android.app.SearchManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.eni.mod6tpintent.databinding.ActivityMainBinding

const val  RC_SEND_SMS = 564;
class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        amb.buttonTel.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                RC_SEND_SMS
            )
        }
        amb.buttonSearch.setOnClickListener {
            val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY, amb.editTextSearch.text.toString())
            }
            startActivity(intent)
        }
    }
    private fun sendSms() {
        var intentSendSms = Intent(
            Intent.ACTION_SENDTO,
            Uri.parse("smsto:${amb.editTextNumeroTel.text.toString()}")
        )
            .apply {
                putExtra("sms_body", "Hello je suis oui")
            }
        startActivity(intentSendSms)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == RC_SEND_SMS
            && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            sendSms()
        }
    }


}