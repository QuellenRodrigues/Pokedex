package com.comp.mypokedexapp.api.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class PokemonAbilities(
    val ability: PokemonAbility,
    val is_hidden: Boolean,
    val slot: Int
) : Parcelable

@Parcelize
data class PokemonAbility(
    val name: String
) : Parcelable