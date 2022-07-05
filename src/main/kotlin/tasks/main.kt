package tasks

fun main() {
    val amount = 5_930.0
    val maxAmount = 15_000.0
    val commission = 0.75
    val minCommission = 35.0
    val isCard = true
    var commissionAmount = 0.0

    if (amount < maxAmount) {
        if (isCard==true) {
            commissionAmount = (amount * commission / 100)
            if (commissionAmount < minCommission) {
                commissionAmount = minCommission
            } else {
                commissionAmount
            }
        } else {
            commissionAmount = 0.0
        }
        println("Комиссия равна: $commissionAmount")
    } else {
        println("Перевод превышает максимальную сумму перевода!")
    }

}