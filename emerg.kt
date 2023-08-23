import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                HeaderSection(text = "Emergency Contacts")
                Spacer(modifier = Modifier.height(16.dp))
                OptionSection(
                    title = "Emergencias",
                    description = "Si se presenta un incidente o percance, por favor marca al número de emergencia y rápidamente te apoyamos.",
                    phoneNumber = "Call 5978-1736"
                )
                Spacer(modifier = Modifier.height(32.dp))
                OptionSection(
                    title = "Clínica UVG",
                    description = "La clínica UVG presenta los siguientes servicios:\n\n- Atención a emergencias\n- Atención primaria a enfermedades comunes\n- Plan educacional sobre enfermedades.",
                    phoneNumber = "Call 5978-1736"
                )
            }
        }
    }
}

@Composable
fun HeaderSection(text: String) {
    Text(text = text, fontSize = 24.sp)
}

@Composable
fun OptionSection(title: String, description: String, phoneNumber: String) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = title, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = description, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = phoneNumber, fontSize = 14.sp, color = Color.Blue)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainActivity()
}
