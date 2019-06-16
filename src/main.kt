fun main() {
    val matrix = Matrix(4, 4)
    matrix.display()

    println()

    var matrix2 = Matrix(3,3)
    matrix2.display()

    println()

    matrix2 = matrix
    matrix2.display()
}