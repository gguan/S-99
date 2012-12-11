package main.scala.com.gguan.solutions

import sys.SystemProperties

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
class P06 extends Solution {

  def isPalindrome[T](list: List[T]): Boolean = list match {

    case List() => true
    case x :: Nil => true
    case x :: rest => x == rest.last && isPalindrome(rest.init)
  }

  // faster
  def isPalindrome2[T](list: List[T]): Boolean = list == list.reverse

  def test() {
    println(isPalindrome(List(1, 2, 3, 2, 1)))

    var t1 = System.nanoTime
    for (i <- 0 to 10000 ) {
      isPalindrome(List(1, 2, 3, 2, 1))
    }
    var t2 = System.nanoTime

    var t3 = System.nanoTime
    for (i <- 0 to 10000 ) {
      isPalindrome2(List(1, 2, 3, 2, 1))
    }
    var t4 = System.nanoTime
    println((t2 - t1) + " vs " + (t4 - t3))
  }
}
