package home.projects.weighttrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import home.projects.weighttrack.ui.theme.WeightTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeightTrackTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    HomeScreen(
                        name = "WeightTrack",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to $name!",
        style = MaterialTheme.typography.headlineMedium,
        modifier = modifier.padding(16.dp)
    )
}