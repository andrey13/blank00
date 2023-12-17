package com.example.blank00

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MyModule {
//    @Provides
//    @Singleton
//    fun provideCookDataBase(@ApplicationContext context: Context) : CookDataBase =
//        CookDataBase.getDatabase(context.applicationContext)
//
////        Room.databaseBuilder(
////            context.applicationContext,
////            CookDataBase::class.java,
////            "cook_database"
////        ).createFromAsset("cook_database").build()
//
//    @Provides
//    @Singleton
//    fun provideCookDao(cookDataBase: CookDataBase) : CookDao =
//        cookDataBase.cookDao()
//
//    @Provides
//    @Singleton
//    fun provideCookRepository(cookDao: CookDao) : CookRepository =
//        CookRepository(cookDao)
}