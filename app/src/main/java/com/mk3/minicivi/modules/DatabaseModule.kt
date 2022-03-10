package com.mk3.minicivi.modules

import android.content.Context
import androidx.room.Room
import com.mk3.minicivi.data.source.MiniCiviDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideMiniCiviDatabase(@ApplicationContext applicationContext: Context) =
        Room.databaseBuilder(applicationContext, MiniCiviDatabase::class.java, "mini_cv_db").build()

    @Singleton
    @Provides
    fun provideEditableResumeDao(miniCiviDatabase: MiniCiviDatabase) =
        miniCiviDatabase.editableResumeDao()
}