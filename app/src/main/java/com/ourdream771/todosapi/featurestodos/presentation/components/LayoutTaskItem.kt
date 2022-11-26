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
    checked:Boolean,
    onClick: ()->Unit,

){
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
            onCheckedChange  ={  }
        )
    }
}

@Preview
@Composable
fun DefaultPreview(){
    //TaskItem()
}