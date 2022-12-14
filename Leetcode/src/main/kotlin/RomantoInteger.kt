fun Solution(s: String):Int {
    val hashMap =  hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)

    var result = 0
    var type = true

    while (type) {
        if (s.contains("IV")) {
            result += 4
            s.replace("IV", "")
        } else if (s.contains("IX")) {
            result += 9
            s.replace("IX", "")
        } else if (s.contains("XL")) {
            result += 40
            s.replace("XL", "")
        } else if (s.contains("XC")) {
            result += 90
            s.replace("XC", "")
        } else if (s.contains("CD")) {
            result += 400
            s.replace("CD", "")
        } else if (s.contains("CM")) {
            result += 900
            s.replace("CM", "")
        } else {
            type = false
        }
    }

    for (i in 0 until s.length) {
        if (hashMap.containsKey(s[i])) {
            var a:Int? = hashMap.get(s[i])
            if (a != null) {
                result += a
            }
        }
    }

    return result
}

fun main() {
    var s = "III"
    println(Solution(s))
}

