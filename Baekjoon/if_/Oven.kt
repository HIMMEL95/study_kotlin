import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
    val need_m = sc.nextInt()

    if (m + need_m >= 60) {
        val plusHour = (m + need_m) / 60
        m = (m + need_m) % 60
        if (h + plusHour >= 24) {
            h = (h + plusHour) % 24
        } else {
            h += plusHour
        }
    } else {
        m += need_m
    }

    println("${h} ${m}")

}