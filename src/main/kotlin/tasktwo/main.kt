package tasktwo

fun main() {
    val likes = 11
    val lastDigit = likes % 10
    var noun = "людям"

    if (likes % 100 == 11) {
        noun = "людям"
    } else if (lastDigit == 1) {
        noun = "человеку"
    } else {
        noun = "людям"
    }
    println("Понравилось $likes $noun")
}
