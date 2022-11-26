package com.ourdream771.todosapi.featurestodos.presentation

import androidx.lifecycle.ViewModel
import com.ourdream771.todosapi.featurestodos.domain.use_case.GetTodosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodosViewModel @Inject constructor(
    private val getTodosUseCase: GetTodosUseCase
): ViewModel(){ }
