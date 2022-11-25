package com.example.tranquilcryptocurrency.presentation.ui.coin_list

import com.example.tranquilcryptocurrency.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
