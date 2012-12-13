package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
class P13 extends Solution {

  def encodeDirect[T](ls: List[T]): List[(Int, T)] = ls match {
    case (head :: rest) => {
      val (span, tail) = ls span { _ == head}
      (span.length, span.head) :: encodeDirect(tail)
    }
    case _ => Nil
  }

  def test() {
    println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
