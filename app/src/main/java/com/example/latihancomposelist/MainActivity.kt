package com.example.latihancomposelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihancomposelist.ui.theme.LatihanComposeListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanComposeListTheme {
                LatihanComposeListApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.jetpack_compose),
            contentDescription = "Logo from Jetpack Compose",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(6.dp))
        Column {
            Text(
                text = "Hello $name!",
                fontFamily = FontFamily.SansSerif,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Welcome to Dicoding! Let's learn together, at our own pace!",
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Serif
            )
        }
    }



}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LatihanComposeListTheme {
        Greeting("Android")
    }
}

private val studentList= listOf(
    "Andre",
    "Desta",
    "Parto",
    "Wendy",
    "Komeng",
    "Raffi Ahmad",
    "Andhika Pratama",
    "Vincent Ryan Rompies"
)

@Composable
fun LatihanComposeListApp(){
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        GreetingStudents(studentName = studentList)
    }
}

@Composable
fun GreetingStudents(studentName:List<String>){

    if (studentName.isNotEmpty()){
        Column {
            for (student in studentName){
                Greeting(name = student)
            }
        }
    }else{
        Text(text = "No students to say hi.. :( ")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGreetingList(){
    LatihanComposeListTheme {
        LatihanComposeListApp()
    }
}