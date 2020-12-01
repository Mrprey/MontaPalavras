package com.example.montapalavras

import Back.main
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import android.annotation.SuppressLint

class DisplayMessageActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val bar: ActionBar? = supportActionBar
        if (bar != null) {     //verificando a existencia da barra
            bar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#0000ff")))   //trocando a cor da barra para azul
            // bar.set
        }

        // Get the Intent that started this activity and extract the string
        // pegando oque foi passado no intent no inicio da atividade e puxando a string(entrada)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        // chando a função main que retorna um array com a palavra formada, o valor da palavra e as letras que sobraram
        //val answer = arrayOf("a","b","c")
        val answer = main(message.toString())

        // passa a palavra formada para o usuario visualizar
        val textView1 = findViewById<TextView>(R.id.text).apply { }
        textView1.text = answer[0].toString()
        // passa a quantidade de pontos da palavra para o usuario ver
        val textView2 = findViewById<TextView>(R.id.text2).apply { }
        textView2.text = "Palavra de ${answer[1]} pontos"
        // passa as letras que sobraram para o usuario ver
        val textView3 = findViewById<TextView>(R.id.text3).apply { }
        textView3.text = answer[2].toString()
    }
}