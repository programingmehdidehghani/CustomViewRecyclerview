package com.example.scrollrecyclerview.extensions

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import androidx.annotation.Px
import androidx.recyclerview.widget.RecyclerView
import com.rubensousa.decorator.ColumnProvider
import com.rubensousa.decorator.GridMarginDecoration
import com.rubensousa.decorator.LinearMarginDecoration


fun Resources.dpToPx(dp: Int): Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp.toFloat(),
        displayMetrics
    ).toInt()
}

fun Resources.dpToPx(dp: Float): Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dp,
        displayMetrics
    ).toInt()
}

fun Context.getGridHorizontalHexagonMarginDecoration() =
    GridMarginDecoration(
        horizontalMargin = this.resources.dpToPx(12),
        verticalMargin = this.resources.dpToPx(12),
        columnProvider = object : ColumnProvider {
            override fun getNumberOfColumns(): Int = 4
        },
        orientation = RecyclerView.HORIZONTAL
    )

fun Context.getGridHorizontalMarginDecoration() =
    GridMarginDecoration(
        horizontalMargin = this.resources.dpToPx(12),
        verticalMargin = this.resources.dpToPx(12),
        columnProvider = object : ColumnProvider {
            override fun getNumberOfColumns(): Int = 4
        },
        orientation = RecyclerView.HORIZONTAL
    )

fun Context.getListHorizontalMarginDecoration(
    @Px leftMargin: Int,
    @Px topMargin: Int,
    @Px rightMargin: Int,
    @Px bottomMargin: Int,
) = LinearMarginDecoration(
    leftMargin = resources.dpToPx(leftMargin),
    topMargin = resources.dpToPx(topMargin),
    rightMargin = resources.dpToPx(rightMargin),
    bottomMargin = resources.dpToPx(bottomMargin),
    orientation = RecyclerView.HORIZONTAL
)