package com.example.tranquilcryptocurrency.data.extension

import com.example.tranquilcryptocurrency.data.remote.dto.CoinDetailDto
import com.example.tranquilcryptocurrency.data.remote.dto.CoinDto
import com.example.tranquilcryptocurrency.domain.model.Coin
import com.example.tranquilcryptocurrency.domain.model.CoinDetail

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}