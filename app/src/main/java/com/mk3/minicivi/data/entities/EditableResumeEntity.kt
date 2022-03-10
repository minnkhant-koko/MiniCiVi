package com.mk3.minicivi.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "editable_resume")
data class EditableResumeEntity(
    @PrimaryKey
    private val id: Long,
    private val resume_name: String,
    private val updated_at: Date,
    private val created_at: Date
)