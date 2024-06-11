package com.example.taskhub.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.taskhub.R
import com.example.taskhub.ui.theme.green_110

@Preview
@Composable
fun RodapePreview() {
    Rodape(navController = rememberNavController())
}

@Composable
fun Rodape(navController: NavController) {
    Row(horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(color = green_110)
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = "Icon Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.logo_taskhub),
            contentDescription = "Logo TaskHub",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_tasks),
            contentDescription = "Icon Tasks",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(50.dp)
        )
    }
}
