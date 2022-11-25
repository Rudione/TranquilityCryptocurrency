package com.example.tranquilcryptocurrency.data.repository

import com.example.tranquilcryptocurrency.data.remote.CoinPaprikaApi
import com.example.tranquilcryptocurrency.data.remote.dto.CoinDetailDto
import com.example.tranquilcryptocurrency.data.remote.dto.CoinDto
import com.example.tranquilcryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}