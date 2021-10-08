package com.example.dependencynow.modul.main

import android.app.Application
import com.example.dependencynow.database.dao.PersonDatabase
import com.example.dependencynow.modul.example.M001Module
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module(includes = [M001Module::class])
@InstallIn(ActivityRetainedComponent::class)
 class MainModule {

 @Provides
 fun provideDataBase(application: Application) = PersonDatabase.builder(application)

 @Provides
 fun provideDao(personDatabase: PersonDatabase) = personDatabase.personDao

}