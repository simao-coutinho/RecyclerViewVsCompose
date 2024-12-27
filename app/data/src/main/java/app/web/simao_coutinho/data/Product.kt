package app.web.simao_coutinho.data

import androidx.annotation.DrawableRes
import java.text.NumberFormat
import kotlin.random.Random

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    @DrawableRes val image: Int
) {
    fun formatedPrice(): String {
        val currencyFormatter = NumberFormat.getCurrencyInstance()
        return currencyFormatter.format(price)
    }

    companion object {
        fun getProducts(): List<Product> {
            val products: MutableList<Product> = mutableListOf()

            products.add(
                Product(
                    id = 1,
                    name = "GPS",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.gps
                )
            )

            products.add(
                Product(
                    id = 2,
                    name = "Smartwatches",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.smartwatches
                )
            )

            products.add(
                Product(
                    id = 3,
                    name = "Earphones",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.earphones
                )
            )

            products.add(
                Product(
                    id = 4,
                    name = "Phones",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.phones
                )
            )

            products.add(
                Product(
                    id = 5,
                    name = "Wellness",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.care
                )
            )

            products.add(
                Product(
                    id = 6,
                    name = "Fitness",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.fitness
                )
            )

            products.add(
                Product(
                    id = 7,
                    name = "Schedules",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.schedules
                )
            )

            products.add(
                Product(
                    id = 8,
                    name = "Wardrobe",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.wardrobe
                )
            )

            products.add(
                Product(
                    id = 9,
                    name = "Jewellery",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.jewellery
                )
            )

            products.add(
                Product(
                    id = 10,
                    name = "Watches",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.watches
                )
            )

            products.add(
                Product(
                    id = 11,
                    name = "Backpacks",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.backpacks
                )
            )

            products.add(
                Product(
                    id = 12,
                    name = "Winter",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.winter
                )
            )

            products.add(
                Product(
                    id = 13,
                    name = "Cleaning",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.clean
                )
            )

            products.add(
                Product(
                    id = 14,
                    name = "Home",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.home
                )
            )

            products.add(
                Product(
                    id = 15,
                    name = "Storage",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.storage
                )
            )

            products.add(
                Product(
                    id = 16,
                    name = "Work",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.work
                )
            )

            products.add(
                Product(
                    id = 17,
                    name = "Daily",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.daily
                )
            )

            products.add(
                Product(
                    id = 18,
                    name = "Edit & Create",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.edit
                )
            )

            products.add(
                Product(
                    id = 19,
                    name = "Gaming",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.gaming
                )
            )

            products.add(
                Product(
                    id = 19,
                    name = "Monitors",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque maximus fermentum lacus, vitae vestibulum nunc accumsan id. Suspendisse eget neque efficitur, faucibus nisi quis, placerat odio.",
                    price = Random.nextDouble(0.0,100.0),
                    image = R.drawable.monitor
                )
            )

            return products
        }
    }
}
