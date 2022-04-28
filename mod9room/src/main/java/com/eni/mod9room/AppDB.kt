package com.eni.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Animal::class], version=3,exportSchema = false)
abstract class AppDB: RoomDatabase() {
    abstract fun animalDao(): AnimalDao
    companion object{
        @Volatile
        private var INSTANCE: AppDB? = null

        fun get(ctx: Context): AppDB{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                        ctx,
                        AppDB::class.java,
                        "animoDb"
                    )
                    .fallbackToDestructiveMigration()
                    .build()
                    INSTANCE = instance
                    return instance
                }else{
                    return instance
                }
            }
        }
    }
}