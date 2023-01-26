package com.pcs.apptoko.response.produk

data class ProdukResponse(
    val `data`: List<Produk>,
    val message: String,
    val success: Boolean
)