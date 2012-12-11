package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */
class P07 extends Solution {

  def flatten(list: List[Any]): List[Any] = list.flatMap {
    case l: List[_] => flatten(l)
    case elem => List(elem)

  }

  def test() {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}