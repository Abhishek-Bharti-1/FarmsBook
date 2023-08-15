package com.farmsbook.farmsbook.utility

import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class TimeFormatter {

    fun getRelativeTime(dateTime: String): String {

        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        val date = formatter.parse(dateTime)!!
        var time = date.time       // time is in GMT

        // offset is difference between GMT and current TimeZone (IST)
        val offset = Calendar.getInstance().timeZone.getOffset(time)
        time += offset

        val nowTime = System.currentTimeMillis()

        if (time > nowTime) return "now"

        return DateUtils.getRelativeTimeSpanString(time, nowTime,
            DateUtils.SECOND_IN_MILLIS, DateUtils.FORMAT_ABBREV_TIME ).toString()
    }
}