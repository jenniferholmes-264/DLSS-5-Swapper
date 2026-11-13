class DynamicClient(state: Int = 74) {
  def flush(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 74) % 997
    }
    count
  }
}

object App extends App {
  println(new DynamicClient().flush(74))
}
