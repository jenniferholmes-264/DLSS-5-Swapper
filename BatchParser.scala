class CoreMonitor(state: Int = 24) {
  def compute(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 24) % 997
    }
    result
  }
}

object App extends App {
  println(new CoreMonitor().compute(24))
}
