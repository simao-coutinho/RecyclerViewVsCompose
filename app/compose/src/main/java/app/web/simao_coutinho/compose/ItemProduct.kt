package app.web.simao_coutinho.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.web.simao_coutinho.compose.ui.theme.ListsTheme
import app.web.simao_coutinho.data.Product

@Composable
fun ItemProduct(
    product: Product,
    modifier: Modifier = Modifier,
    onProductClicked: (Product) -> (Unit)
) {
    Column( modifier = modifier.fillMaxWidth()) {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            ),
            colors = CardDefaults.cardColors().copy(
                containerColor = MaterialTheme.colorScheme.background
            ),
            modifier = Modifier.clickable {
                onProductClicked(product)
            }
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Image(
                    painter = painterResource(product.image),
                    contentDescription = product.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(70.dp)
                        .clip(RoundedCornerShape(10.dp))
                )

                Column(
                    modifier = Modifier.width(0.dp).weight(1f)
                ) {
                    Text(
                        text = product.name,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = product.description,
                        maxLines = 2
                    )
                }

                Text(
                    text = product.formatedPrice(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold

                )
            }
        }
    }
}

@Preview
@Composable
private fun ItemProductPreview() {
    ListsTheme {
        ItemProduct(
            Product.getProducts().first(),
            onProductClicked = {}
        )
    }
}