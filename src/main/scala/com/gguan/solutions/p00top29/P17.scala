package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
class P17 extends Solution {

  def split[T](n: Int, ls: List[T]): (List[T], List[T]) = {
    ls.splitAt(n)
  }

  def test() {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
