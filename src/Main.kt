fun main() {


}

fun isValidIPV4(str: String) :Boolean {
    val parts = str.split(".")
    if (parts.size != 4) return false
    for (part in parts) {
        if (part.isEmpty() || part.any { !it.isDigit() })
            return false  // Each part should be num and not empty

        val num = part.toIntOrNull() ?: return false // if it is a char of double

        if (num !in 0..255) //out od range
            return false

        if (part.length > 1 && part[0] == '0')
            return false  // leading zeros
    }

    return true
}
fun isSudokuValid(arr: List<List<Char>>) :Boolean {

    return checkRow(arr) && checkCol(arr) && checkSubgrid(arr)
}

fun checkRow(arr: List<List<Char>>) :Boolean {
    loop1@for (i in arr.indices) {
        var vec = IntArray(arr.size)
        for(j in arr[i].indices) {
            val x = arr[i][j]
            if(x ==  '-')
                continue
            else if(x in '1'..('1' + arr[i].size - 1)) {
                vec[x - '1']++
                if(vec[x - '1'] > 1) {
                    return false
                    break@loop1
                }
            }
            else {
                return false
                break@loop1
            }
        }
    }
    // in real implementation we trim spaces
    return true
}

fun checkCol(arr: List<List<Char>>) :Boolean {
    loop1@for (i in arr.indices) {
        var vec = IntArray(arr.size)
        for(j in arr[i].indices) {
            val x = arr[j][i]
            if(x ==  '-')
                continue
            else if(x in '1'..('1' + arr[i].size - 1)) {
                vec[x - '1']++
                if(vec[x - '1'] > 1) {
                    return false
                    break@loop1
                }
            }
            else {
                return false
                break@loop1
            }
        }
    }
    // in real implementation we trim spaces
    return true
}

fun checkSubgrid(arr: List<List<Char>>): Boolean {
    val n = Math.sqrt(arr.size.toDouble()).toInt()

    loop1@for (blockRow in 0 until arr.size step n) {
        for (blockCol in 0 until arr.size step n) {
            var vec = IntArray(arr.size)

            for (i in 0 until n) {
                for (j in 0 until n) {
                    val x = arr[blockRow + i][blockCol + j]
                    if (x == '-') continue
                    else if (x in '1'..('1' + arr.size - 1)) {
                        vec[x - '1']++
                        if (vec[x - '1'] > 1) {
                            return false
                            break@loop1
                        }
                    } else {
                        return false
                        break@loop1
                    }
                }
            }
        }
    }
    return true
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

