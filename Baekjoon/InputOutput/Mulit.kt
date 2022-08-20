// memory : 13520kb, 124ms
// import java.util.Scanner

// fun main(args: Array<String>) {
//   val sc: Scanner = Scanner(System.`in`)

//   val num1 = sc.nextInt()
//   val num2 = sc.nextInt()

//   val result1 = num1 * (num2 % 10)
//   val result2 = num1 * ((num2 % 100) / 10)
//   val result3 = num1 * (num2 / 100)

//   println(result1)
//   println(result2)
//   println(result3)
//   println(result1 + (result2 * 10) + (result3 * 100))
// }

// memory : 12388kb, 92ms
// fun main(args: Array<String>) {
//   val a = readLine()!!.toInt()
//   val b = readLine()!!.toInt()

//   println(a * (b % 10))
//   println(a * ((b % 100) / 10))
//   println(a * (b / 100))
//   println(a * (b % 10) + (a * ((b % 100) / 10)) * 10 + a * (b / 100) * 100)
// }

// memory : 12384kb, 88ms
fun main(args: Array<String>) {

  val num1 = readLine()!!.toInt()
  val num2 = readLine()!!.toInt()

  val result1 = num1 * (num2 % 10)
  val result2 = num1 * ((num2 % 100) / 10)
  val result3 = num1 * (num2 / 100)

  println(result1)
  println(result2)
  println(result3)
  println(result1 + (result2 * 10) + (result3 * 100))
}
