package com.ourdream771.todosapi.featurestodos.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItem(
    name:String,
    onClick: ()->Unit,

){
    var checked by rememberSaveable{ mutableStateOf(false) }

    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = name,
            modifier = Modifier.weight(1f)
        )
        Checkbox(
            checked = checked ,
            onCheckedChange  ={ checked = it }
        )
        IconButton(onClick = onClick) {
            Icon(Icons.Filled.Close,contentDescription = "Close")

        }


    }
}

@Preview
@Composable
fun DefaultPreview(){
    //TaskItem()
}