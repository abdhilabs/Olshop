package com.mriksani.coderswag.Services

import com.mriksani.coderswag.Model.Category
import com.mriksani.coderswag.Model.Product

object DataServices {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Force Hat Limited", "$20", "hat1"),
        Product("Force Hat Limited", "$20", "hat2"),
        Product("Force Hat Limited", "$20", "hat3"),
        Product("Force Hat Limited", "$20", "hat4"),
        Product("Force Hat Limited", "$20", "hat1"),
        Product("Force Hat Limited", "$20", "hat2"),
        Product("Force Hat Limited", "$20", "hat3"),
        Product("Force Hat Limited", "$20", "hat4")

        )

    val hoodies = listOf(
        Product("Force Hoodie Limited", "$25", "hoodie1"),
        Product("Force Hoodie Red", "$25", "hoodie2"),
        Product("Force Hoodie Gray", "$25", "hoodie3"),
        Product("Force Hoodie Black", "$25", "hoodie4"),
        Product("Force Hoodie Limited", "$25", "hoodie1"),
        Product("Force Hoodie Red", "$25", "hoodie2"),
        Product("Force Hoodie Gray", "$25", "hoodie3"),
        Product("Force Hoodie Black", "$25", "hoodie4"),
        Product("Force Hoodie Limited", "$25", "hoodie1"),
        Product("Force Hoodie Red", "$25", "hoodie2"),
        Product("Force Hoodie Gray", "$25", "hoodie3"),
        Product("Force Hoodie Black", "$25", "hoodie4")
    )

    val shirts = listOf(
        Product("Force Shirt Limited", "$15", "shirt1"),
        Product("Force Shirt White", "$12", "shirt2"),
        Product("Force Shirt Red", "$13", "shirt3"),
        Product("Force Shirt Gray", "$11", "shirt4"),
        Product("Force Shirt Black", "$14", "shirt5"),
        Product("Force Shirt Limited", "$15", "shirt1"),
        Product("Force Shirt White", "$12", "shirt2"),
        Product("Force Shirt Red", "$13", "shirt3"),
        Product("Force Shirt Gray", "$11", "shirt4"),
        Product("Force Shirt Black", "$14", "shirt5"),
        Product("Force Shirt Limited", "$15", "shirt1"),
        Product("Force Shirt White", "$12", "shirt2"),
        Product("Force Shirt Red", "$13", "shirt3"),
        Product("Force Shirt Gray", "$11", "shirt4"),
        Product("Force Shirt Black", "$14", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String): List<Product> {

        return when (category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}