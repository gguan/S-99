package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 4:07 AM
 * To change this template use File | Settings | File Templates.
 */
class P05 extends Solution {

  def reverse[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => reverse(tail) ::: List(head)
  }

  // much faster
  def reverse2[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]()) { (l, r) => r :: l }
  }

  def test() {
    println(reverse(List(1, 1, 2, 3, 5, 8)))
    println(reverse2(List(1, 1, 2, 3, 5, 8)))

    var t1 = System.nanoTime
    for (i <- 0 to 10000 ) {
      reverse(List(1, 2, 3, 2, 1))
    }
    var t2 = System.nanoTime

    var t5 = System.nanoTime
    for (i <- 0 to 10000 ) {
      List(1, 2, 3, 2, 1).reverse
    }
    var t6 = System.nanoTime

    var t3 = System.nanoTime
    for (i <- 0 to 10000 ) {
      reverse2(List(1, 2, 3, 2, 1))
    }
    var t4 = System.nanoTime


    println((t2 - t1) + " vs " + (t4 - t3) + " vs " + (t6 - t5))
  }
}
