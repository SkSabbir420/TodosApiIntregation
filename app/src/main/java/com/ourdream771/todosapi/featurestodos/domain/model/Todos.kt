package com.ourdream771.todosapi.featurestodos.domain.model

data class Todos(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)