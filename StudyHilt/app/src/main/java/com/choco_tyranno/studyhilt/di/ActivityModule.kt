package com.choco_tyranno.studyhilt.di

import com.choco_tyranno.studyhilt.di.qualifier.ActivityHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(ActivityComponent::class)
@Module
object ActivityModule {

    @ActivityHash
    @Provides
    fun provideHash() = hashCode().toString()

}