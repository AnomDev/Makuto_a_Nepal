package com.anomdev.makutoanepal.data.blogpost

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BlogPost(
    val image: String,
    val title: String,
    val date: String,
    val body: String,
): Parcelable

