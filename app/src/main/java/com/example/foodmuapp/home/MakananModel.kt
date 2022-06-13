package com.example.foodmuapp.home

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MakananModel (
    var title: String? = null,
    var gambar: Int = 0,
    var harga: String? = null
) : Parcelable