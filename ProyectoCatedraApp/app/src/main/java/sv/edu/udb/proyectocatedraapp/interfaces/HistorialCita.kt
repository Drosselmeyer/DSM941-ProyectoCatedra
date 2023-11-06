package sv.edu.udb.proyectocatedraasb.interfaces

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import sv.edu.udb.proyectocatedraasb.R

@Composable
fun HistorialCita(modifier: Modifier = Modifier) {
    val numRows = 4
    val numCols = 5
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .rotate(degrees = 0.25f)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-46).dp,
                    y = (-20).dp)
                .requiredWidth(width = 443.dp)
                .requiredHeight(height = 840.dp)
                .rotate(degrees = 0.25f))
        LazyVerticalGrid(
            columns = GridCells.Fixed(numCols)
        ) {
            for (row in 0 until numRows) {
                val isTopRow = row == 0

                item {
                    Cell(isTopRow = isTopRow)
                }
            }
        }

    }
}

@Composable
fun Cell(isTopRow: Boolean) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(if (isTopRow) Color(0xFFF7BF6C) else Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = if (isTopRow) "Top" else "Regular",
            fontSize = 18.sp,
            color = Color.Black,
        )
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun HistorialCitaPreview() {
    HistorialCita(Modifier)
}