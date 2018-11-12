package io.qnips.parcelize

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ParcelizeModel(
        val someString: String,
        val anyInt: Int
) : Parcelable
