// COM MVVM
package br.com.fiap.calculodejuros
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.fiap.calculodejuros.juros.JurosScreen
import br.com.fiap.calculodejuros.juros.JurosScreenViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    JurosScreen(JurosScreenViewModel())
                }
            }
        }


