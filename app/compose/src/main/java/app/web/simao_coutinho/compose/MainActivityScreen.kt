package app.web.simao_coutinho.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.web.simao_coutinho.compose.ui.theme.ListsTheme
import app.web.simao_coutinho.data.Product

@Composable
fun MainActivityScreen(
    products: List<Product>,
    onFabClicked: () -> (Unit),
    onProductClicked: (Product) -> (Unit),
    modifier: Modifier = Modifier
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = onFabClicked
            ) {
                Icon(
                    imageVector = Icons.Default.Shuffle,
                    contentDescription = stringResource(R.string.shuffle_products)
                )
            }
        }
    ) { innerPadding ->
        val listState = rememberLazyListState()

        LazyColumn(
            state = listState,
            modifier = modifier.padding(innerPadding).padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(items = products, key = { it.id }) { item ->
                ItemProduct(product = item, modifier = Modifier.animateItem()) {
                    onProductClicked(item)
                }
            }
        }
    }

}

@Preview
@Composable
private fun MainActivityScreenPreview() {
    ListsTheme {
        MainActivityScreen(
            Product.getProducts(),
            onProductClicked = {},
            onFabClicked = {}
        )
    }

}