package com.ourdream771.todosapi.featurestodos.domain.repository

import com.ourdream771.todosapi.featurestodos.domain.model.Todos

interface TodosRepository {
    suspend fun getTodosLists():List<Todos>
}