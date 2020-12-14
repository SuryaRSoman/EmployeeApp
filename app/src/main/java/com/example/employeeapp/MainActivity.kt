package com.example.employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        var getempc=findViewById<EditText>(R.id.empc)
        var getempn=findViewById<EditText>(R.id.empn)
        var getdes=findViewById<EditText>(R.id.des)
        var getcomp=findViewById<EditText>(R.id.comp)
        var getplc=findViewById<EditText>(R.id.plc)

        Toast.makeText(this,getempc.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getempn.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getdes.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getcomp.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getplc.text.toString(),Toast.LENGTH_LONG).show()
    }
}