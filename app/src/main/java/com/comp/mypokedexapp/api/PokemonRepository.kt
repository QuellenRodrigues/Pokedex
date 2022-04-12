package com.comp.mypokedexapp.api

import com.comp.mypokedexapp.api.model.PokemonApiResult
import com.comp.mypokedexapp.api.model.PokemonEvolutions
import com.comp.mypokedexapp.api.model.PokemonSpecies
import com.comp.mypokedexapp.api.model.PokemonsApiResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepository {
    // https://pokeapi.co/api/v2/pokemon/?limit=151

    private val service: PokemonService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(
                GsonConverterFactory.create()
            ).build()

        service = retrofit.create(PokemonService::class.java)

    }

    fun getListPokemons(limit: Int = 151): PokemonsApiResult? {
        val call = service.listPokemons(limit)
        return call.execute().body()
    }

    fun getPokemon(id: Int): PokemonApiResult? {
        val call = service.getPokemon(id)
        return call.execute().body()
    }

    fun getPokemonSpecies(id: Int): PokemonSpecies? {
        val call = service.getPokemonSpecies(id)
        return call.execute().body()

    }

    fun getPokemonEvolutions(id: Int): PokemonEvolutions? {
        val call = service.getPokemonEvolutions(id)
        return call.execute().body()

    }
}

