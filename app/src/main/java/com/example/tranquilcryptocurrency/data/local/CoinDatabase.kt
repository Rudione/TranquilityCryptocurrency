package com.example.tranquilcryptocurrency.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tranquilcryptocurrency.data.remote.dto.CoinDto

@Database(entities = [CoinDto::class], version = 1)
abstract class CoinDatabase: RoomDatabase() {
    abstract fun coinDao(): CoinDao

    companion object {
        @Volatile
        var INSTANCE: CoinDatabase? = null

        @Synchronized
        fun getInstance(context: Context): CoinDatabase {
            if(INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    CoinDatabase::class.java,
                    "coin.db"
                ).fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE as CoinDatabase
        }
    }
}