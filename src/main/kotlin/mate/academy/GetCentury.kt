package mate.academy
const val YEARS_IN_CENTURY = 100
const val CENTURY_OFFSET = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    if (year % YEARS_IN_CENTURY == ZERO) {
        return year / YEARS_IN_CENTURY
    }else {
        return year / YEARS_IN_CENTURY + CENTURY_OFFSET
    }
}
