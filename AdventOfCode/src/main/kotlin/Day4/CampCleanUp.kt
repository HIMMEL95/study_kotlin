package Day4

import java.nio.file.Files
import java.nio.file.Paths

fun partOne(): Int {
    val path = Paths.get("./inputs/DAY4/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val inputArr = mutableListOf<String>()
    lineList.forEach {
        var line = it.split(", ")
        var str = line.get(0).replace(",", "-")
        var lines = str.split("-")
        inputArr.add(lines.toString())
    }

    var count=0
    for (i in 0 until inputArr.size) {
        var str = inputArr.get(i).split(", ")

        var fs = str[0].replace("[","").toInt()
        var fe = str[1].toInt()
        var ss = str[2].toInt()
        var se = str[3].replace("]","").toInt()

        if (fs >= ss && fe <= se) count++
        else if (ss >= fs && se <= fe) count++
    }
    return count
}

fun partTwo(): Int {
    val path = Paths.get("./inputs/DAY4/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val inputArr = mutableListOf<String>()
    lineList.forEach {
        var line = it.split(", ")
        var str = line.get(0).replace(",", "-")
        var lines = str.split("-")
        inputArr.add(lines.toString())
    }

    var count=0
    for (i in 0 until inputArr.size) {
        var str = inputArr.get(i).split(", ")

        var fs = str[0].replace("[","").toInt()
        var fe = str[1].toInt()
        var ss = str[2].toInt()
        var se = str[3].replace("]","").toInt()

        if ((fs <= ss && fe >= ss) || (fs <= se && fe >= se)) count++
        else if ((ss <= fs && se >= fs) || (ss <= fe && se >= fe)) count++
    }

    return count
}

fun main() {
    println(partOne())
    println(partTwo())
}