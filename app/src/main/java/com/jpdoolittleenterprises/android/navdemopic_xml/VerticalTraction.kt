package com.jpdoolittleenterprises.android.navdemopic_xml

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class VerticalTraction(
    @PrimaryKey
    var date: Date,
    var weight: Int,
    var reps: Int
)
