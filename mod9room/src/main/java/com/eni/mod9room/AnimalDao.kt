package com.eni.mod9room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnimalDao {
    @Insert
    fun insert(animal: Animal)

    @Query("SELECT * FROM Animal")
    fun getAll(): List<Animal>
}