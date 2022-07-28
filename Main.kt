import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = arrayOf(11,22,33,44,55,6,7,8,9)
val array2 = IntArray(100)
var c = 0
    var count  = 0
    for(e in array.indices){

        if (array[e]%11==0){
            array2[count]=array[e]
            count++
c++
        }
    }

    var res = 0
for (e in 0 until count){

    res+=array2[e]
println(array2[e])
}
println()
    println(res)
println(c)


    }







