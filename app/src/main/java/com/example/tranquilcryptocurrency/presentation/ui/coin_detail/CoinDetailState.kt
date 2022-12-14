package com.example.tranquilcryptocurrency.presentation.ui.coin_detail

import com.example.tranquilcryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
