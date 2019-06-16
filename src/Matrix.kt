import kotlin.random.Random

class Matrix(m: Int, n: Int) {
    var _matrix = arrayOf<Array<Int>>()
    var _m = m
    var _n = n

    init {
        for(i in 0.._m) {
            var array = arrayOf<Int>()
            for(j in 0.._n) {
                array += Random.nextInt(0, 10)
            }
            _matrix += array
        }
    }

    fun display() {
        for(array in _matrix) {
            for(value in array) {
                print("$value ")
            }
            println()
        }
    }


}