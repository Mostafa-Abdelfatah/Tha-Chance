fun main() {

}

fun isValidIPV4(str: String) :Boolean {
    // in real implementation we trim spaces
    return false
}
fun isSudokuValid(arr: List<List<Char>>) :Boolean {

    return false
}

fun check(description: String, result: String, correctResult: String) {
    val state = if(result == correctResult){
        "Success"
    }
    else {
        "Failed"
    }
    println("$state in $description")
}

