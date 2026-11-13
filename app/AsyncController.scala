class DynamicMonitor(state: Int = 46) {
  def parse(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 46) % 997
    }
    result
  }
}

object App extends App {
  println(new DynamicMonitor().parse(46))
}
