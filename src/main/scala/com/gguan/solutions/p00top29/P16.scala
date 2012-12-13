package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */
class P16 extends Solution {
  def drop[T](n: Int, ls: List[T]): List[T] = {
    if(ls.length < n) return ls
    var (l1, l2) = ls.splitAt(n-1)
    l1 ::: drop(n, l2.tail)
  }

  // use filter
  def drop2[T](n: Int, ls: List[T]): List[T] = {
    ls.zipWithIndex.filter{ v => (v._2 + 1) % n != 0 }.map( _._1 )
  }

  def test() {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(drop2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
