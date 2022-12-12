package Day3

import java.nio.file.Files
import java.nio.file.Paths


fun partOne(): Int {
    val path = Paths.get("./inputs/DAY3/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val lowerCase = HashMap<Char, Any>()
    val upperCase = HashMap<Char, Any>()

    for (i in 1..26) {
        lowerCase.put((96+i).toChar(), i)
        upperCase.put((64+i).toChar(), i+26)
    }

    val count = mutableListOf<Int>()

    var sum = 0
    lineList.forEach {
        var left = it.substring(0, it.length/2)
        var right = it.substring(it.length/2)

        for (i in 0 until left.length) {
            if (left.contains(right[i])) {
                if(right[i].isUpperCase()) {
                    count.add(upperCase.get(right[i]) as Int)
                } else {
                    count.add(lowerCase.get(right[i]) as Int)
                }
                break
            }
        }
    }

    count.forEach {
        sum += it
    }
    return sum
}
fun partTwo(): Int {
    val path = Paths.get("./inputs/DAY3/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val lowerCase = HashMap<Char, Any>()
    val upperCase = HashMap<Char, Any>()

    for (i in 1..26) {
        lowerCase.put((96+i).toChar(), i)
        upperCase.put((64+i).toChar(), i+26)
    }

    val listArr= mutableListOf<String>()

    for (i in 0 until lineList.size) {
        val set = mutableSetOf<Char>()
        for (j in 0 until lineList.get(i).length) {
            set.add(lineList.get(i)[j])
        }

        var str = ""
        set.forEach {
            str += it.toChar()
        }
        listArr.add(str)
    }

    val result = mutableListOf<Int>()
    for (i in 0 until listArr.size step 3) {
        val set = mutableSetOf<Char>()
        for(j in 0 until listArr.get(i+1).length) {
            var str = listArr.get(i+1)[j]
            if (listArr.get(i).contains(str)) {
                set.add(str)
            }
        }

        for (j in 0 until listArr.get(i+2).length) {
            if (set.contains(listArr.get(i+2)[j])) {
                if (listArr.get(i+2)[j].isUpperCase()) {
                    result.add(upperCase.get(listArr.get(i+2)[j]) as Int)
                } else {
                    result.add(lowerCase.get(listArr.get(i+2)[j]) as Int)
                }
            }
        }
    }

    var count = 0
    result.forEach {
        count += it
    }

    return count
}

fun main() {
    println(partOne())
    println(partTwo())
}