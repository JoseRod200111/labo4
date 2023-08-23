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
                HeaderSection(text = "Settings")
                Spacer(modifier = Modifier.height(16.dp))
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
fun OptionsSection() {
    Column {
        OptionItem(icon = Icons.Default.Edit, text = "Edit Profile")
        OptionItem(icon = Icons.Default.Email, text = "Email Addresses")
        OptionItem(icon = Icons.Default.Notifications, text = "Notifications")
        OptionItem(icon = Icons.Default.Security, text = "Privacy")
        OptionItem(icon = Icons.Default.Help, text = "Help and Feedback")
        OptionItem(icon = Icons.Default.Info, text = "About")
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
