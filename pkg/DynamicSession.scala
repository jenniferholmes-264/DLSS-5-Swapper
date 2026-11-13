class SharedProcessor(state: Int = 44) {
  def load(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 44) % 997
    }
    acc
  }
}

object App extends App {
  println(new SharedProcessor().load(44))
}
