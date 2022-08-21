import java.util.Scanner

fun main() {
  val sc: Scanner = Scanner(System.`in`)

  var h = sc.nextInt()
  var m = sc.nextInt()

  if (m - 45 < 0) {
    // 분침이 45분보다 작을 때
    if (h <= 0) {
      // 시간이 0시보다 작거나 같을 때, 시간을 24시로 초기화 시켜줌.
      h = 24
      h--
      m = m + (60 - 45)
    } else { // 아니면 그냥 분침만 수정
      h--
      m = m + (60 - 45)
    }
  } else {
    m -= 45
  }

  println(h)
  println(m)
}
