package com.ourdream771.todosapi.featurestodos.presentation

import com.ourdream771.todosapi.featurestodos.domain.model.Todos

data class TodosListState(
    val isLoading: Boolean = false,
    val todosList: List<Todos> = emptyList(),
    val error: String = ""
)