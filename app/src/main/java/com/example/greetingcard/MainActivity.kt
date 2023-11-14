package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Magenta) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}



/*
* The Surface widget is a container that represents a section of UI
* where you can alter the appearance, such as the background color or border.
 */

/*
* A Modifier is used to augment or decorate a composable.
* One modifier you can use is the padding modifier,
* which adds space around the element (in this case, adding space around the text).
 */

//@Composable functions can't return anything.

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Reka")
    }
}

/*
* All functions marked with the @Composable annotation can be called from the setContent()
* function or from other Composable functions. The annotation tells the Kotlin compiler that
* this function is used by Jetpack Compose to generate the UI.
*/

/*
* The GreetingPreview() function is a cool feature that lets you see what your composable
* looks like without having to build your entire app. To enable a preview of a composable,
* annotate it with @Composable and @Preview. The @Preview annotation tells Android Studio
* that this composable should be shown in the design view of this file.
 */

/*
* The @Preview annotation takes in a parameter called showBackground.
* If showBackground is set to true, it will add a background to your composable preview.
 */