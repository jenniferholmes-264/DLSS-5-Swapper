class RemoteService(state: Int = 20) {
  def decode(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 20) % 997
    }
    acc
  }
}

object App extends App {
  println(new RemoteService().decode(20))
}
