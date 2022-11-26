package com.ourdream771.todosapi.featurestodos.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ourdream771.todosapi.featurestodos.domain.model.Todos

@Composable
fun TaskItemList(list:List<Todos>){

    LazyColumn(
        modifier = Modifier
    ){
        items(list.size) {index ->
            TaskItem(
                name = list[index].title ,
                checked = list[index].completed,
                onClick = { }
            )
        }
    }
}