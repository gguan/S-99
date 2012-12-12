package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
class P15 extends Solution {

  def duplicateN[T](n: Int, ls: List[T]): List[T] = {
    ls.foldLeft(List[T]()) { (r, e) => r ::: List.fill(n)(e) }
  }

  def duplicateN2[T](n: Int, ls: List[T]): List[T] = {
    ls.flatMap { e => List.fill(n)(e) }
  }

  def test() {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
    println(duplicateN2(3, List('a, 'b, 'c, 'c, 'd)))
  }
}
