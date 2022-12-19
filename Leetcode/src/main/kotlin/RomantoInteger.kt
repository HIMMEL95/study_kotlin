fun Solution(s: String):Int {
    val symbol = arrayListOf<Char>('I', 'V', 'X', 'L', 'C', 'D', 'M')
    val value = arrayListOf<Int>(1, 5, 10, 50, 100, 500, 1000)

    val hashMap = mutableMapOf<Char, Int>()

    for (i in 0 until symbol.size) {
        hashMap.put(symbol[i], value[i])
    }

    var str = s
    var result = 0
    var type = true

    while (type) {
        if (str.contains("IV")) {
            result += 4
            str = str.replace("IV", "")
        } else if (str.contains("IX")) {
            result += 9
            str = str.replace("IX", "")
        } else if (str.contains("XL")) {
            result += 40
            str = str.replace("XL", "")
        } else if (str.contains("XC")) {
            result += 90
            str = str.replace("XC", "")
        } else if (str.contains("CD")) {
            result += 400
            str = str.replace("CD", "")
        } else if (str.contains("CM")) {
            result += 900
            str = str.replace("CM", "")
        } else {
            type = false
        }
    }


    for (i in 0 until str.length) {
        if (hashMap.containsKey(str[i])) {
            var count: Int? = hashMap.get(str.elementAt(i))
            if (count != null) {
                result += count
            }
        }
    }
    return result
}


fun main() {
//    var s = "III"
//    println(Solution(s))
    var s = "MCMXCIV"
    println(Solution(s))

}

