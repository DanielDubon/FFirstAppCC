package com.example.ffirstappcc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ffirstappcc.ui.theme.Driver
import com.example.ffirstappcc.ui.theme.FFirstAppCCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FFirstAppCCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                    Main()


                }
            }
        }
    }

    fun Main(){

        val driver1 = Driver("Juan", "Gallo", "Guatemala",502);
        val driver2 = Driver("Pepe", "Tecate", "Mexico",777);
        val driver3 = Driver("Kara", "Monte Carlo", "Usa",69);





        Log.d("EJERCICIO TRACK 1", driver1.toString());
        Log.d("EJERCICIO TRACK 1", driver2.toString());
        Log.d("EJERCICIO TRACK 1", driver3.toString());

        if(driver1.number == driver2.number){
            Log.d("EJERCICIO TRACK 2","Son iguales");

        }else{
            Log.d("EJERCICIO TRACK 2","No son iguales");
        }


        if(driver1.number != driver3.number){
            Log.d("EJERCICIO TRACK 2","No son iguales");

        }else{
            Log.d("EJERCICIO TRACK 2","Son iguales");
        }

        val driver1cpy = driver1.copy(country = "afganistan");

        Log.d("EJERCICIO TRACK 3", driver1.toString());
        Log.d("EJERCICIO TRACK 3", driver1cpy.toString());



        var name = driver1.name;
        var team = driver1.team;
        var country = driver1.country;
        var num = driver1.number;

        Log.d("EJERCICIO TRACK 4",name);
        Log.d("EJERCICIO TRACK 4",team);
        Log.d("EJERCICIO TRACK 4",country);
        Log.d("EJERCICIO TRACK 4",num.toString());

        Log.d("EJERCICIO TRACK 5",driver1.toString())



    }



}




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FFirstAppCCTheme {
        Greeting("Android")
    }
}