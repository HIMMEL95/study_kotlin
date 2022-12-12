import java.io.File
import java.io.FileReader
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    println(partOne())
    println(partTwo())
}

fun partOne(): Int {
    val path = Paths.get("./inputs/DAY1/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val result = mutableListOf<Int>()

    var sum = 0
    lineList.forEach {
        if (!it.equals("")) {
            sum += it.toInt()
        } else {
            result.add(sum)
            sum = 0
        }
    }
    result.sortWith(Comparator.reverseOrder())

    return result.get(0)
}

fun partTwo() : Int {
    val path = Paths.get("./inputs/DAY1/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val result = mutableListOf<Int>()

    var sum = 0
    lineList.forEach {
        if (!it.equals("")) {
            sum += it.toInt()
        } else {
            result.add(sum)
            sum = 0
        }
    }
    result.sortWith(Comparator.reverseOrder())

    return result.get(0) + result.get(1) + result.get(2)
}