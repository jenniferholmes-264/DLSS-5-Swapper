class HybridProvider(state: Int = 54) {
  def build(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 54) % 997
    }
    count
  }
}

object App extends App {
  println(new HybridProvider().build(54))
}
