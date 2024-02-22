package com.wcsm.aulaapicommvvm.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wcsm.aulaapicommvvm.data.model.Postagem
import com.wcsm.aulaapicommvvm.data.model.PostagemAPI
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val listaPostagens = MutableLiveData<List<Postagem>>()

    fun recuperarPostagens() {

        val postagemAPI = PostagemAPI()

        viewModelScope.launch {
            val postagens = postagemAPI.recuperarPostagens()
            listaPostagens.postValue(postagens)
        }
    }

}