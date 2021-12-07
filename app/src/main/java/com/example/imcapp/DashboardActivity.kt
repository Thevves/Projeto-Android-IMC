package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    lateinit var nomeUsuario: TextView
    lateinit var profissaoUsuario: TextView
    lateinit var alturaUsuario: TextView

    lateinit var cardPesarAgora: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar!!.hide()

        nomeUsuario = findViewById(R.id.nome_usuario)
        profissaoUsuario = findViewById(R.id.profissao_usuario)
        alturaUsuario = findViewById(R.id.altura_usuario)

        cardPesarAgora = findViewById(R.id.card_pesar_agora)

        cardPesarAgora.setOnClickListener {
            val abrirPesagem = Intent(this, pesagem::class.java)
            startActivity(abrirPesagem)
        }

        // *** Carregar os dados da SharedPreferences nos campos da dashboard
        val arquivo = getSharedPreferences("cadastro", MODE_PRIVATE)

        // *** Abrir o arquivo cadastro
        nomeUsuario.text = arquivo.getString("nome", "")
        profissaoUsuario.text = arquivo.getString("profissão", "")
        alturaUsuario.text = arquivo.getFloat("altura", 0.0f).toString()

    // *** Pegar os dados do arquivo e jogar nos TextViews

    }
}