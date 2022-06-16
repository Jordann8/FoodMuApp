package com.example.foodmuapp.home

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MakananPlusModel (
    var titleplus: String? = null,
    var gambarplus: Int = 0,
    var hargaplus: String? = null,
    var restoplus: String? = null
) : Parcelable {
    var jumlahplus : Int = 0
}
