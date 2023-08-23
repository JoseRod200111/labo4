import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
                HeaderSection(text = "My Profile")
                Spacer(modifier = Modifier.height(16.dp))
                ProfileImage(imageResId = R.drawable.profile_image)
                Spacer(modifier = Modifier.height(32.dp))
                OptionsSection()
            }
        }
    }
}

@Composable
fun HeaderSection(text: String) {
    Text(text = text, fontSize = 24.sp)
}

@Composable
fun ProfileImage(imageResId: Int) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
            .background(Color.Gray)
            .padding(bottom = 16.dp)
    )
}

@Composable
fun OptionsSection() {
    Column {
        OptionItem(icon = Icons.Default.LocationOn, text = "My Campus")
        OptionItem(icon = Icons.Default.People, text = "My Friends")
        OptionItem(icon = Icons.Default.CalendarToday, text = "My Calendar")
        OptionItem(icon = Icons.Default.Book, text = "My Courses")
        OptionItem(icon = Icons.Default.Grade, text = "My Grades")
        OptionItem(icon = Icons.Default.Group, text = "My Groups")
        OptionItem(icon = Icons.Default.Event, text = "My Upcoming Events")
    }
}

@Composable
fun OptionItem(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = text, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainActivity()
}
