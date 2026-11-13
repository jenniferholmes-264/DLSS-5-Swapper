class BatchEngine(state: Int = 44) {
  def flush(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 44) % 997
    }
    result
  }
}

object App extends App {
  println(new BatchEngine().flush(44))
}
