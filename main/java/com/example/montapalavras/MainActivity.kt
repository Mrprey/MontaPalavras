package com.example.montapalavras

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bar: ActionBar? = supportActionBar
        if (bar != null) {     //verificando a existencia da barra
            bar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#0000ff")))   //trocando a cor da barra para azul
           // bar.set
        }
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)  //buscando local da entrada do usuario
        val message = editText.text.toString()    //pegando oq o usuario e escreveu
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {  //pegando a proxima ativida(tela)
            putExtra(EXTRA_MESSAGE, message)   //passando a entrada o usuario para proxima atividade
        }
        startActivity(intent)    //iniciando proxima ativida(nesse caso tela)
    }
 }