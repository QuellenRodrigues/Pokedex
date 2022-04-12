package com.comp.mypokedexapp.api.model

data class PokemonsApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)
data class PokemonResult(
    val name: String,
    val url: String
)