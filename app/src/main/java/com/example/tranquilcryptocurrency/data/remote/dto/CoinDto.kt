package com.example.tranquilcryptocurrency.data.remote.dto


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "coin_table")
data class CoinDto(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    @ColumnInfo(name = "name")
    val name: String,
    val rank: Int,
    @ColumnInfo(name = "symbol")
    val symbol: String,
    val type: String
)
