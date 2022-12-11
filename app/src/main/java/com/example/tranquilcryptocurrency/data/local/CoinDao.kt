package com.example.tranquilcryptocurrency.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tranquilcryptocurrency.data.remote.dto.CoinDto

@Dao
interface CoinDao {
    @Insert
    fun insert(user: CoinDto)

    @Update
    fun update(user: CoinDto)

    @Delete
    fun delete(user: CoinDto)

    @Query("SELECT * from coin_table ORDER BY name ASC")
    fun getAlphabetizedUsers(): LiveData<List<CoinDto>>
}