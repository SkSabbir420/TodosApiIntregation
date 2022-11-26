package com.ourdream771.todosapi.featurestodos.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ourdream771.todosapi.featurestodos.core.Resource
import com.ourdream771.todosapi.featurestodos.domain.use_case.GetTodosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class TodosViewModel @Inject constructor(
    private val getTodosUseCase: GetTodosUseCase
): ViewModel(){

    private val _state = mutableStateOf(TodosListState())
    val state: State<TodosListState> = _state

    init {
        getCoins()
    }

    private fun getCoins() {
        getTodosUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = TodosListState(todosList = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = TodosListState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = TodosListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}
