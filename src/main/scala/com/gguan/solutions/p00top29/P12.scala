package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
class P12 extends Solution {

  def decode[T](ls: List[(Int, T)]): List[T] = {
    ls.flatMap{ e => List.fill(e._1)(e._2)}
  }

  def test() {
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }
}
