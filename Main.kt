import kotlin.random.Random

fun main() {
    printNumArray()

    printCities()

    printSortedArray()
}

fun printSortedArray() {
    val array = Array(20) { Random.nextInt(21) }

    for (i in 0..array.lastIndex) {
        for (j in 0..<array.lastIndex - i) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }

    for (element in array) {
        print("$element ")
    }
}

fun printCities() {
    val array = arrayOf("kiev", "lviv", "odessa")
    for (i in 0..array.lastIndex) {
        var word: String = array[i]
        word = word.replaceFirstChar { char -> char.uppercaseChar() }
        word = word.substring(0, word.lastIndex) + word[word.lastIndex].uppercaseChar()
        println(word)
    }
}

fun printNumArray() {
    var array = Array(20) { i -> i + 1 }
    for (i in 0..array.lastIndex) {
        if (array[i] % 2 == 0) {
            array[i] += 10
        }
        print("${array[i]} ")
    }
}
