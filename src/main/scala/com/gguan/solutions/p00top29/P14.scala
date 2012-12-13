package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:01 PM
 * To change this template use File | Settings | File Templates.
 */
class P14 extends Solution {

  def duplicate[T](ls: List[T]): List[T] = {
    ls.foldRight(List[T]()) { (e, r) => e :: e :: r }
  }

  def duplicate2[A](list: List[A]): List[A] = {
    list.flatMap { e => List(e,e) }
  }

  def test() {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

}
