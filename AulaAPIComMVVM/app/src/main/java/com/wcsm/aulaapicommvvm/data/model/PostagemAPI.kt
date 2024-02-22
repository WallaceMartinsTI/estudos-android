package com.wcsm.aulaapicommvvm.data.model

import com.wcsm.aulaapicommvvm.data.api.RetrofitService

class PostagemAPI {

    suspend fun recuperarPostagens() : List<Postagem> {

        val jsonPlace = RetrofitService.recuperarJsonPlace()

        try {
            val retorno = jsonPlace.recuperarPostagens()
            if(retorno.isSuccessful) {
                retorno.body()?.let {postagens ->
                    return postagens
                }
            }
        } catch (erroRecuperarPostagem: Exception) {
            erroRecuperarPostagem.printStackTrace()
        }

        return emptyList()
    }
}