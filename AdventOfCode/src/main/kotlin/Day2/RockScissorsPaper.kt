package Day2

import java.nio.file.Files
import java.nio.file.Paths
import java.util.Objects
import kotlin.collections.mutableListOf as mutableListOf

fun partOne(): Int {
    val path = Paths.get("./inputs/DAY2/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    val hashMap = mutableMapOf("X" to "A", "Y" to "B", "Z" to "C")

    var totalScore = 0
    lineList.forEach {
        var score = 0

        var cpu:String = it.split(" ")[0]
        var me:String = it.split(" ")[1]

        if (Objects.equals(me, "X")) score += 1
        else if (Objects.equals(me, "Y")) score += 2
        else if (Objects.equals(me, "Z")) score += 3

        me = hashMap.get(me).toString()

        if (Objects.equals(cpu, me)) score += 3
        else if (Objects.equals(cpu, "A") && Objects.equals(me, "B")) score += 6;
        else if (Objects.equals(cpu, "B") && Objects.equals(me, "C")) score += 6;
        else if (Objects.equals(cpu, "C") && Objects.equals(me, "A")) score += 6;

        totalScore += score
    }
    return totalScore
}

fun partTwo(): Int {
    val path = Paths.get("./inputs/DAY2/input.txt")
    val lineList = mutableListOf<String>() //String 리스트의 값 lineList
    Files.lines(path, Charsets.UTF_8).forEach {
        lineList.add(it)
    }

    var values = mutableListOf<String>()
    values.add("A")
    values.add("B")
    values.add("C")

    var totalScore = 0
    lineList.forEach {
        var score = 0

        var cpu:String = it.split(" ")[0]
        var me:String = it.split(" ")[1]

        if (Objects.equals(me, "X")) score += 0
        else if (Objects.equals(me, "Y")) score += 3
        else if (Objects.equals(me, "Z")) score += 6

        var more = values.indexOf(cpu) + 1

        if (Objects.equals(me, "X")) more -= 1
        else if (Objects.equals(me, "Z")) more += 1

        more %= 3
        score += more

        if(more == 0) score += 3

        totalScore += score
    }
    return totalScore
}

fun  main() {
    println(partOne())
    println(partTwo())
}
