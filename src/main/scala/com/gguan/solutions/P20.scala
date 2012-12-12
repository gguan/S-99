package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */
class P20 extends Solution {

  def removeAt[T](n: Int, ls: List[T]): (List[T], T) = {
    val (l1, l2) = ls.splitAt(n)
    (l1 ::: l2.tail, l2.head)
  }

  def test() {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

}
