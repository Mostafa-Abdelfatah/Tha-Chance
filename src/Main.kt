fun main() {
    var arr = IntArray(9)
    arr[0]++
    arr.forEach { i -> println(i) }
    println('1' + 8)
    val invalidSudoku4: List<List<Char>> = listOf(
        listOf('1','4','3','4'),
        listOf('3','4','1','2'),
        listOf('2','1','4','3'),
        listOf('4','3','2','1')
    )
    println(checkSubgrid(invalidSudoku4))

    val board = listOf(
        listOf('1','2','3','4'),
        listOf('3','4','1','2'),
        listOf('2','1','4','3'),
        listOf('4','3','2','1')
    )
    println(checkRow(board))

}

fun isValidIPV4(str: String) :Boolean {
    return false
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

