fun main() {
    var board: List<List<Char>> = listOf(
        listOf('5','3','4','6','7','8','9','1','2'),
        listOf('6','7','2','1','9','5','3','4','8'),
        listOf('1','9','8','3','4','2','5','6','7'),
        listOf('8','5','9','7','6','1','4','2','3'),
        listOf('4','2','6','8','5','3','7','9','1'),
        listOf('7','1','3','9','2','4','8','5','6'),
        listOf('9','6','1','5','3','7','2','8','4'),
        listOf('2','8','7','4','1','9','6','3','5'),
        listOf('3','4','5','2','8','6','1','7','9')
    )
    check(
        description = "Valid complete 9x9 Sudoku",
        result = isSudokuValid(board).toString(),
        correctResult = "true"
    )

    // Test Case 2: Valid incomplete 9x9 Sudoku (using '-' for empty cells)
     board = listOf(
        listOf('5','3','-','6','7','8','9','1','2'),
        listOf('6','7','2','1','9','5','3','4','8'),
        listOf('1','9','8','3','4','2','5','6','7'),
        listOf('8','5','9','7','6','1','4','2','3'),
        listOf('4','2','6','8','5','3','7','9','1'),
        listOf('7','1','3','9','2','4','8','5','6'),
        listOf('9','6','1','5','3','7','2','8','4'),
        listOf('2','8','7','4','1','9','6','3','5'),
        listOf('3','4','5','2','8','6','1','7','9')
    )
    check(
        description = "Valid incomplete 9x9 Sudoku",
        result = isSudokuValid(board).toString(),
        correctResult = "true"
    )

    // Test Case 3: Invalid Sudoku – Duplicate in a row (first row has two '5's)
    board = listOf(
        listOf('5','5','4','6','7','8','9','1','2'),
        listOf('6','7','2','1','9','5','3','4','8'),
        listOf('1','9','8','3','4','2','5','6','7'),
        listOf('8','5','9','7','6','1','4','2','3'),
        listOf('4','2','6','8','5','3','7','9','1'),
        listOf('7','1','3','9','2','4','8','5','6'),
        listOf('9','6','1','5','3','7','2','8','4'),
        listOf('2','8','7','4','1','9','6','3','5'),
        listOf('3','4','5','2','8','6','1','7','9')
    )
    check(
        description = "Invalid Sudoku - Duplicate in a row",
        result = isSudokuValid(board).toString(),
        correctResult = "false"
    )

    // Test Case 4: Invalid Sudoku – Duplicate in a column (first column has two '5's)
    board = listOf(
        listOf('5','3','4','6','7','8','9','1','2'),
        listOf('5','7','2','1','9','5','3','4','8'),
        listOf('1','9','8','3','4','2','5','6','7'),
        listOf('8','5','9','7','6','1','4','2','3'),
        listOf('4','2','6','8','5','3','7','9','1'),
        listOf('7','1','3','9','2','4','8','5','6'),
        listOf('9','6','1','5','3','7','2','8','4'),
        listOf('2','8','7','4','1','9','6','3','5'),
        listOf('3','4','5','2','8','6','1','7','9')
    )
    check(
        description = "Invalid Sudoku - Duplicate in a column",
        result = isSudokuValid(board).toString(),
        correctResult = "false"
    )

    // Test Case 5: Invalid Sudoku – Duplicate in a 3x3 subgrid
    board = listOf(
        listOf('5','3','4','6','7','8','9','1','2'),
        listOf('6','5','2','1','9','5','3','4','8'),
        listOf('1','9','8','3','4','2','5','6','7'),
        listOf('8','5','9','7','6','1','4','2','3'),
        listOf('4','2','6','8','5','3','7','9','1'),
        listOf('7','1','3','9','2','4','8','5','6'),
        listOf('9','6','1','5','3','7','2','8','4'),
        listOf('2','8','7','4','1','9','6','3','5'),
        listOf('3','4','5','2','8','6','1','7','9')
    )
    check(
        description = "Invalid Sudoku - Duplicate in a 3x3 subgrid",
        result = isSudokuValid(board).toString(),
        correctResult = "false"
    )

    // Test Case 6: Valid 4x4 Sudoku
    board = listOf(
        listOf('1','2','3','4'),
        listOf('3','4','1','2'),
        listOf('2','1','4','3'),
        listOf('4','3','2','1')
    )
    check(
        description = "Valid 4x4 Sudoku",
        result = isSudokuValid(board).toString(),
        correctResult = "true"
    )

    // Test Case 7: Invalid 4x4 Sudoku – Duplicate in a row
    val invalidSudoku4: List<List<Char>> = listOf(
        listOf('1','1','3','4'),
        listOf('3','4','1','2'),
        listOf('2','1','4','3'),
        listOf('4','3','2','1')
    )
    check(
        description = "Invalid 4x4 Sudoku - Duplicate in a row",
        result = isSudokuValid(invalidSudoku4).toString(),
        correctResult = "false"
    )
}




