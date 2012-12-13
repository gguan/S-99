package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
class P10 extends Solution {

  def encode[T](ls: List[T]): List[(Int, T)] = {
    val p09 = new P09

    p09.pack(ls).map(e => (e.length, e.head))
  }

  def test() {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
