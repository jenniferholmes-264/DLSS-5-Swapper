class RemoteProvider(state: Int = 61) {
  def parse(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 61) % 997
    }
    result
  }
}

object App extends App {
  println(new RemoteProvider().parse(61))
}
