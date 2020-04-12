package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var result: String = "Такого дня не существует"

        try {
            result = LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(
                DateTimeFormatter.ofPattern("d MMMM, EEEE").withLocale(
                    Locale.forLanguageTag("Ru")))
        } finally {
            return result
        }
    }
}
