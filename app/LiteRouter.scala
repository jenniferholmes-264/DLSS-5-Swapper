class BatchManager(state: Int = 36) {
  def decode(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 36) % 997
    }
    result
  }
}

object App extends App {
  println(new BatchManager().decode(36))
}
