package com.addpayafrica.hardwareinfoapp

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private lateinit var getInfor_Btn : Button
    private lateinit var viewInfor : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        getInfor_Btn = findViewById<Button?>(R.id.bt_get_details)


        getInfor_Btn.setOnClickListener {

            var SERIAL = ("SERIAL: " + Build.SERIAL)
            var MODEL = ("MODEL: " + Build.MODEL)
            var ID=  ("ID: " + Build.ID)
            var Manufacture = ("Manufacture: " + Build.MANUFACTURER)
            var brand = ("brand: " + Build.BRAND)
            var type = ("type: " + Build.TYPE)
            var user = ("user: " + Build.USER)
            var BASE = ("BASE: " + Build.VERSION_CODES.BASE)
            var INCREMENTAL = ("INCREMENTAL " + Build.VERSION.INCREMENTAL)
            var SDK = ("SDK  " + Build.VERSION.SDK)
            var BOARD = ("BOARD: " + Build.BOARD)
            var BRAND = ("BRAND " + Build.BRAND)
            var HOST = ("HOST " + Build.HOST)
            var FINGERPRINT = ("FINGERPRINT: "+Build.FINGERPRINT)
            var VersionCode = ("Version Code: " + Build.VERSION.RELEASE)
            var ManuFacturer = "ManuFacturer :"+ (Build.MANUFACTURER)
            var Board = ("Board : "+ Build.BOARD)
            var Display = ("Display : "+ Build.DISPLAY)

            var infor = SERIAL+"\n"+MODEL+"\n"+ID+"\n"+Manufacture+"\n"+brand+"\n"+type+"\n"+user+"\n"+BASE+"\n"+INCREMENTAL+"\n"+SDK+"\n"+BOARD+"\n"+BRAND+"\n"+HOST+"\n"+FINGERPRINT+"\n"+VersionCode+"\n"+ManuFacturer+"\n"+Board+"\n"+Display+"\n"


            var textView = findViewById<TextView?>(R.id.tv_hardware)

            textView.text = infor



        }



    }
}