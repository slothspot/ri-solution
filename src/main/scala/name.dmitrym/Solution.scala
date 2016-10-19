package name.dmitrym

import scala.collection.mutable
import scala.io.StdIn

class Solution(n: Int, orders: IndexedSeq[(Int, Int)]) {
  def averageWaitingTime(): Long = {
    var currentTime = 0l
    var servingTime = 0l
    var idx = 0
    // Priority queue sorted by shortest serve time
    val queue =
      mutable.PriorityQueue[(Int, Int)]()(Ordering.by[(Int, Int), Int](-_._2))
    // customers list sorted by appearance time
    val sortedOrders = orders.sortBy(_._1)

    while (idx < n) {
      // put available customers to serving queue
      sortedOrders.view(idx, n).takeWhile(_._1 <= currentTime).foreach { c =>
        queue.enqueue(c)
        idx += 1
      }

      def processCustomer(): Unit = {
        val c = queue.dequeue()
        servingTime += currentTime + c._2 - c._1
        currentTime += c._2
      }

      if (queue.nonEmpty) {
        processCustomer()
        if (idx == n) { // if we don't have new customers coming, let's serve the tail of the queue
          while (queue.nonEmpty) {
            processCustomer()
          }
        }
      } else if (idx != n) {// if serving queue is empty wait for next customer
        currentTime = sortedOrders(idx)._1
      }
    }

    servingTime / n
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    val waitingCustomers = for (_ <- 0 until n)
      yield
        StdIn.readLine().split(" ") match {
          case Array(t, l) => (t.toInt, l.toInt)
        }
    println(new Solution(n, waitingCustomers).averageWaitingTime())
  }
}
