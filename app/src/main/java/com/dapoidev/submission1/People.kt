package com.dapoidev.submission1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class People(
    var avatar: Int,
    var name: String,
    var username: String,
    var follower: String,
    var following: String,
    var repo: String,
    var company: String,
    var location : String
):Parcelable