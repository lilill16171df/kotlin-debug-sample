package com.survivalcoding

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.String

class YukymController {

    fun getTyA(): String {
        return when (LocalDate.now().monthValue) {
            in 1..2 -> "경오1국"
            in 3..4 -> "경오2국"
            in 5..6 -> "경오3국"
            in 7..8 -> "경오4국"
            in 9..10 -> "경오5국"
            else -> "경오6국" // 11, 12
        }
    }

    fun getTyB(): String {
        return when (LocalTime.now().hour) {
            in 0..1 -> "갑자1국"
            in 2..3 -> "갑자2국"
            in 4..5 -> "갑자3국"
            in 6..7 -> "갑자4국"
            in 8..9 -> "갑자5국"
            in 10..11 -> "갑자6국"
            in 12..13 -> "갑자7국"
            in 14..15 -> "갑자8국"
            in 16..17 -> "갑자9국"
            in 18..19 -> "갑자10국"
            in 20..21 -> "갑자11국"
            else -> "갑자12국" // 22..23
        }
    }
}
