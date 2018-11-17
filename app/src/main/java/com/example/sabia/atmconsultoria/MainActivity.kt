package com.example.sabia.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_contato.setOnClickListener {
            Toast.makeText(applicationContext,"Contato foi clicado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,DetalheContatoActivity::class.java)
            startActivity(intent)
        }

        button_cliente.setOnClickListener {
            Toast.makeText(applicationContext,"Clientes foi clicado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,DetalheClientesActivity::class.java)
            startActivity(intent)
        }

        button_empresa.setOnClickListener {
            Toast.makeText(applicationContext,"Empresa foi clicado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,DetalheEmpresaActivity::class.java)
            startActivity(intent)
        }

        button_servicos.setOnClickListener {
            Toast.makeText(applicationContext,"Serviços foi clicado", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,DetalhesServicosActivity::class.java)
            startActivity(intent)
        }


    }

}
