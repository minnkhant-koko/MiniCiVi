package com.mk3.minicivi.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mk3.minicivi.data.entities.EditableResumeEntity

@Database(entities = [EditableResumeEntity::class], version = 1)
abstract class MiniCiviDatabase : RoomDatabase() {
    abstract fun editableResumeDao(): EditableResumeDao
}