import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MainActivity() {
    MyApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                HeaderSection(text = "Campus Central")
                Spacer(modifier = Modifier.height(16.dp))
                TitleSection(text = "Destacados")
                FeaturedImagesRow()
                Spacer(modifier = Modifier.height(16.dp))
                TitleSection(text = "Servicios y Recursos")
                ServicesImagesRow()
            }
        }
    }
}

@Composable
fun HeaderSection(text: String) {
    Text(text = text, fontSize = 24.sp)
}

@Composable
fun TitleSection(text: String) {
    Text(text = text, fontSize = 18.sp)
}

@Composable
fun FeaturedImagesRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        FeaturedImage(imageResId = R.drawable.image1)
        Spacer(modifier = Modifier.width(16.dp))
        FeaturedImage(imageResId = R.drawable.image2)
    }
}

@Composable
fun ServicesImagesRow() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ServiceImage(imageResId = R.drawable.image3)
        Spacer(modifier = Modifier.width(16.dp))
        ServiceImage(imageResId = R.drawable.image4)
    }
}

@Composable
fun FeaturedImage(imageResId: Int) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .background(Color.Gray)
    )
}

@Composable
fun ServiceImage(imageResId: Int) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(Color.Gray)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainActivity()
}
