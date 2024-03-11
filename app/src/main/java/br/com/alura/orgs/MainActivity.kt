package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    // Responsável por inicializar a atividade
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define qual arquivo de layout será usado
        setContentView(R.layout.activity_main)

        var nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"

        var descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja manga, maça"

        var valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"
    }
}
