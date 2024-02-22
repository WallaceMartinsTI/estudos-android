package com.wcsm.aulaapicommvvm.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wcsm.aulaapicommvvm.R
import com.wcsm.aulaapicommvvm.databinding.ActivityMainBinding
import com.wcsm.aulaapicommvvm.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.listaPostagens.observe(this) {listaPostagens ->
            var listaResultado = ""
            listaPostagens.forEach { postagem ->
                listaResultado += "${postagem.id}) ${postagem.title} \n"
            }
            binding.textResultado.text = listaResultado
        }
    }

    override fun onStart() {
        super.onStart()
        mainViewModel.recuperarPostagens()
    }
}