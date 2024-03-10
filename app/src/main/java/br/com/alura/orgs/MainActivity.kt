package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {

    // Responsável por inicializar a atividade
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define qual arquivo de layout será usado
        setContentView(R.layout.activity_main)
    }
}
