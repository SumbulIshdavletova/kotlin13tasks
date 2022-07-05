package taskthree

fun main() {
    var amount = 1070.00
    val monthlyUser = false

    if (amount <= 1000) {
        amount
    } else if (amount > 1000 && amount <= 10_000) {
        amount -= 100
    } else {
        amount -= (amount * 5 / 100)
    }

    if (monthlyUser == true) {
        amount -= (amount * 1 / 100)
    } else {
        amount
    }
    println("Ваша конечная цена $amount")
}

