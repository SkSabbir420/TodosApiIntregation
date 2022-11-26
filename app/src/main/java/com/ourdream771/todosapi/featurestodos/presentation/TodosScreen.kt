package com.ourdream771.todosapi.featurestodos.presentation


import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ourdream771.todosapi.featurestodos.presentation.components.TaskItemList

@Composable
fun TodosScreen(){

    val viewModel:TodosViewModel = viewModel()

    TaskItemList(viewModel.taskList)


}