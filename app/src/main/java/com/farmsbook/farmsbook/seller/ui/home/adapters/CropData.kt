package com.farmsbook.farmsbook.seller.ui.home.adapters

data class CropData(
    var crop_name: String? = null,
    var crop_image: Int = 0,
    var crop_location : String? = null,
    var max_price : String?= null,
    var min_price : String?= null,
    var timestamp : String? = null,
    var user : String? = null,
    var quantity : String? = null,
    var id : String? = null,
    var parent_id : String? = null,
    var offer : String? = null
)