// Memory : 13516kb, 120ms
// import java.util.Scanner

// fun main(args: Array<String>) {
//   val sc: Scanner = Scanner(System.`in`)

//   val score = sc.nextInt()

//   if (score >= 90 && score <= 100) {
//     println("A")
//   } else if (score >= 80 && score < 90) {
//     println("B")
//   } else if (score >= 70 && score < 80) {
//     println("C")
//   } else if (score >= 60 && score < 70) {
//     println("D")
//   } else {
//     println("F")
//   }
// }

// Memory : 12344kb, 96ms
fun main(args: Array<String>) {
  val score = readLine()!!.toInt()

  when (score) {
    in 90..100 -> println("A")
    in 80..89 -> println("B")
    in 70..79 -> println("C")
    in 60..69 -> println("D")
    else -> println("F")
  }
}
