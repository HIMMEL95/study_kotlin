import java.util.Scanner

fun main() {
  val sc: Scanner = Scanner(System.`in`)

  val a = sc.nextInt()
  val b = sc.nextInt()

  if (a > b) {
    println(">")
  } else if (a < b) {
    println("<")
  } else {
    println("==")
  }
}
