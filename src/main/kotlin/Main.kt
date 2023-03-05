package ru.netology

fun main() {
    val commissionRate = 0.0075
    val minimalCommission = 35.0
    var amount = 5000.0
    var commission = amount * commissionRate
    if (commission < minimalCommission) {
        commission = minimalCommission
    }
    amount -= commission
    println (amount)
}