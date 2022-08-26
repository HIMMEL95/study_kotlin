import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here

    var plus = 0.0
    var minus = 0.0
    var zero = 0.0

    for (i in 0 until arr.size) {
        if (arr[i] > 0) plus++
        else if (arr[i] < 0) minus++
        else zero++
    }
    
    println(plus/arr.size)
    println(minus/arr.size)
    println(zero/arr.size)
}

fun main(args: Array<String>) {
    // val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

