package com.comp.mypokedexapp.api.model

import android.view.inspector.IntFlagMapping
import com.comp.mypokedexapp.domain.PokemonType

data class PokemonApiResult (
    val id: String,
    val name: String,
    val weight: String,
    val height: String,
    val base_experience: String,
    val types: List<PokemonTypeSlot>,
    val abilities: List<PokemonAbilities>,
    var species: PokemonSpecies,
    val biography: String,
    val base_happiness: String,
    val capture_rate: String,
    val growth_rate: Rate,
    val stats: List<Stats>
)


data class PokemonTypeSlot(
    val slot: Int,
    val type: PokemonType
)
