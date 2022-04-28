package com.eni.mod12web

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import org.json.JSONObject
import java.io.IOException


class MainActivity : AppCompatActivity() {
    companion object{
        private const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Création du client HTTP
        val client = OkHttpClient()
        //Création d'une requête
        val google = Request.Builder()
                            .addHeader("Authorization","Bearer <TOKEN>")
                            .url("https://swapi.dev/api/people/1")
                            .build()
        //Exécution de notre requête
        client.newCall(google).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
                println("error")
            }

            override fun onResponse(call: Call, response: Response) {
                //Log.i(TAG, "onResponse: ${response.body?.string()}")
                if(response.code != 200)
                    return
                val peopleJson = JSONObject(response.body?.string())
                val people = People(
                    peopleJson.getString("name"),
                    peopleJson.getString("height"),
                    peopleJson.getString("mass"),
                    peopleJson.getString("eye_color"),
                    peopleJson.getString("gender"),
                )
                Log.i(TAG, "Le personnage ${people.name} mesure ${people.height} et pèse ${people.mass}")
            }

        })
    }




}