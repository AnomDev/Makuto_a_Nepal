package com.anomdev.makutoanepal.data.country

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TopicElement(
    val image: Int,
    val title: String,
    val body: String
): Parcelable