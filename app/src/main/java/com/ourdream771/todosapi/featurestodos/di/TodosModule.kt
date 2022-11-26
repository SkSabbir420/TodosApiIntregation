package com.ourdream771.todosapi.featurestodos.di

import com.ourdream771.todosapi.featurestodos.data.remote.TodosApi
import com.ourdream771.todosapi.featurestodos.data.repository.TodosRepositoryImpl
import com.ourdream771.todosapi.featurestodos.domain.repository.TodosRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodosModule{

    @Provides
    @Singleton
    fun provideTodosApi(): TodosApi {
        return Retrofit.Builder()
            .baseUrl(TodosApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodosApi::class.java)
    }

    @Provides
    @Singleton
    fun provideTodosRepository(api:TodosApi):TodosRepository{
        return TodosRepositoryImpl(api)
    }

}