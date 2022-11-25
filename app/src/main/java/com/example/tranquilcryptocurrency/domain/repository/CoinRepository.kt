package com.example.tranquilcryptocurrency.domain.repository

import com.example.tranquilcryptocurrency.data.remote.dto.CoinDetailDto
import com.example.tranquilcryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}