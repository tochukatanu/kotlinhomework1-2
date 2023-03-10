package ru.netology

fun main() {
    val commissionRate = 0.0075
    val minimalCommission = 35.0
    val amount = 900.0
    var commission = amount * commissionRate
    if (commission < minimalCommission) {
        commission = minimalCommission
    }
    println(commission)
}