fun main(args: Array<String>) {
    var h = readLine()!!.toInt()
    var m = readLine()!!.toInt()
    var need_m = readLine()!!.toInt()

    if (m + need_m >= 60) {
        h++
        m = (m + need_m) - 60
        if (m >= 60) {
            h++
            m = (m + need_m) - 60
        }
    } else {
        m += need_m
    }

    println(h)
    println(m)

}