package com.has.prova

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calcularButton: Button = findViewById(R.id.CalcularButton)
    }

    @SuppressLint("ResourceType")
    fun calculateSigno(view: View){
        val Dia =findViewById<EditText>(R.id.EditText_Data)
        val messageDia =  Dia.text.toString()
        val messageDia2 = messageDia.toDouble()
        val Mes = findViewById<EditText>(R.id.editText_Mes)
        val messageMes = Mes.text.toString()
        val messageMes2 = messageMes.toDouble()

        val result = 0



        if ((messageDia2 >21 && messageMes2 < 4 && messageMes2 > 2) &&
            ( messageDia2 > 20 && messageMes2 < 5 && messageMes2 > 3 )){
               val result = 1
            //aries
            }
            else if ((messageDia2 >21 && messageMes2 < 5 && messageMes2 > 3) &&
                ( messageDia2 > 20 && messageMes2 < 6 && messageMes2 > 4 )){
            val result = 2

            }
            else if ((messageDia2 >21 && messageMes2 < 6 && messageMes2 > 4) &&
                ( messageDia2 > 20 && messageMes2 < 7 && messageMes2 > 5 )){
            val result = 3

            }
            else if ((messageDia2 >21 && messageMes2 < 7 && messageMes2 > 5) &&
                ( messageDia2 > 22 && messageMes2 < 8 && messageMes2 > 6 )){
            val result = 4


            }
            else if ((messageDia2 >23 && messageMes2 < 8 && messageMes2 > 6) &&
                ( messageDia2 > 22 && messageMes2 < 9 && messageMes2 > 7 )){
                val result = 5


            }
            else if ((messageDia2 >23 && messageMes2 < 9 && messageMes2 > 7) &&
                ( messageDia2 > 22 && messageMes2 < 10 && messageMes2 > 8 )){
                val result = 6


            }
            else if ((messageDia2 >23 && messageMes2 < 10 && messageMes2 > 8) &&
                ( messageDia2 > 22 && messageMes2 < 11 && messageMes2 > 9 )){
                val result = 7


            }
            else if ((messageDia2 >23 && messageMes2 < 11 && messageMes2 > 9) &&
                ( messageDia2 > 21 && messageMes2 < 12 && messageMes2 > 10 )){
                val result = 8


            }
            else if ((messageDia2 >22 && messageMes2 < 12 && messageMes2 > 10) &&
                ( messageDia2 > 21 && messageMes2 < 13 && messageMes2 > 11 )){
                val result = 9


            }
            else if ((messageDia2 >22 && messageMes2 < 13 && messageMes2 > 11) &&
                ( messageDia2 > 20 && messageMes2 < 2 && messageMes2 > 0 )){
                val result = 10


            }
            else if ((messageDia2 >21 && messageMes2 < 2 && messageMes2 > 0) &&
                ( messageDia2 > 19 && messageMes2 < 3 && messageMes2 > 1 )){
                val result = 11


            }
            else if ((messageDia2 >19 && messageMes2 < 3 && messageMes2 > 1) &&
                ( messageDia2 > 20 && messageMes2 < 4 && messageMes2 > 2 )){
                val result = 12


            }
            val ImageSigno: ImageView = findViewById(R.id.Signo)

            val CodigoSigno = when (result){
             1 ->  R.drawable.ares
             2 ->  R.drawable.tauru
             3 ->  R.drawable.gemini
             4 ->  R.drawable.cancer
             5 ->  R.drawable.leo
             6 ->  R.drawable.virgo
             7 ->  R.drawable.libra
             8 ->  R.drawable.scorpio
             9 ->  R.drawable.sagitarius
             10 -> R.drawable.capri
             11 -> R.drawable.aqua
             else -> R.drawable.pisces
            }
            ImageSigno.setImageResource(CodigoSigno)



    }

}