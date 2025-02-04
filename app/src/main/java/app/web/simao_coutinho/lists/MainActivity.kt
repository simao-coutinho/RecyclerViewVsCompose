package app.web.simao_coutinho.lists

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import app.web.simao_coutinho.data.Product
import app.web.simao_coutinho.lists.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var products = Product.getProducts()
        val productAdapter = ProductAdapter { product: Product ->
            Toast.makeText(
                this@MainActivity,
                "Product Clicked: ${product.name}",
                Toast.LENGTH_LONG
            ).show()
        }

        with(binding.rvProducts) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = productAdapter
        }

        productAdapter.submitList(products)

        binding.fabShuffle.setOnClickListener {
            products = products.shuffled()
            productAdapter.submitList(products)
        }
    }
}