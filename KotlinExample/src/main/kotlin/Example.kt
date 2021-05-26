fun main() {
    println("Hello Kotlin.")
    printOddOrEventNumberText(100)
    printOddOrEventNumberText(99)
}

fun printOddOrEventNumberText(num: Int) {
    val text = if (num % 2 == 1) {
        "奇数"
    } else {
        "偶数"
    }

    println(text)
}