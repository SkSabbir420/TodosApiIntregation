package com.ourdream771.todosapi.featurestodos.data.repository

import com.ourdream771.todosapi.featurestodos.data.remote.TodosApi
import com.ourdream771.todosapi.featurestodos.domain.model.Todos
import com.ourdream771.todosapi.featurestodos.domain.repository.TodosRepository
import javax.inject.Inject

class TodosRepositoryImpl @Inject constructor(
    private val api:TodosApi
): TodosRepository {

    override suspend fun getTodosLists(): List<Todos> {
        return api.getTodos()
    }

}