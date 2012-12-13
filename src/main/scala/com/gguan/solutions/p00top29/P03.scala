package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
class P03 extends Solution {

  def nth[T](n:Int, list:List[T]):T = n match {
    case 0 => list.head
    case _ => nth(n-1, list.tail)
  }


  def test() {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))
  }
}
