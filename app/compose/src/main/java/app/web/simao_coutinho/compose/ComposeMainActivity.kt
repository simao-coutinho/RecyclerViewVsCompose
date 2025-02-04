package app.web.simao_coutinho.compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import app.web.simao_coutinho.compose.ui.theme.ListsTheme
import app.web.simao_coutinho.data.Product

class ComposeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListsTheme {
                var products by rememberSaveable { mutableStateOf(Product.getProducts()) }
                val context = LocalContext.current

                MainActivityScreen(
                    products = products,
                    onProductClicked = { product: Product ->
                        Toast.makeText(
                            context,
                            "Product Clicked: ${product.name}",
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    onFabClicked = {
                        products = products.shuffled()
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListsTheme {
        MainActivityScreen(
            Product.getProducts(),
            onProductClicked = {},
            onFabClicked = {}
        )
    }
}