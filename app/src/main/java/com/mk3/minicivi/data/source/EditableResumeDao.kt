package com.mk3.minicivi.data.source

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mk3.minicivi.data.entities.EditableResumeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface EditableResumeDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertResume(vararg editableResumeEntity: EditableResumeEntity)

    @Query("Select * from editable_resume")
    fun getAllResumes(): Flow<List<EditableResumeEntity>>
}