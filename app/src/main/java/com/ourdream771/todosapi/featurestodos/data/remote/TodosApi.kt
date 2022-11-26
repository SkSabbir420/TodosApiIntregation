package com.ourdream771.todosapi.featurestodos.data.remote

import com.ourdream771.todosapi.featurestodos.domain.model.Todos
import retrofit2.Response
import retrofit2.http.GET

interface TodosApi {

    @GET("/todos")
    suspend fun getTodos():List<Todos>

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }
}