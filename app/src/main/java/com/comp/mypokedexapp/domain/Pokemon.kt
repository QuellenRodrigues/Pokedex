package com.comp.mypokedexapp.domain

import com.comp.mypokedexapp.api.model.PokemonAbility
import com.comp.mypokedexapp.api.model.PokemonEvolutions
import com.comp.mypokedexapp.api.model.Rate
import com.comp.mypokedexapp.api.model.Stats

data class Pokemon(
    val id: String,
    val name: String,
    val weight: String,
    val height: String,
    val base_experience: String,
    val types: List<PokemonType>,
    val abilities: List<PokemonAbility>,
    val species: String,
    val biography: String,
    val base_happiness: String,
    val capture_rate: String,
    val growth_rate: Rate,
    val evolutions: PokemonEvolutions,
    val stats: List<Stats>

) {
    val formattedNumber = id.padStart(3,'0')
    val imageUrl= "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$id.png"

}