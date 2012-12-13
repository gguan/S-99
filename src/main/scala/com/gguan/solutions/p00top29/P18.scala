package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
class P18 extends Solution {

  def slice[T](l: Int, k: Int, ls: List[T]): List[T] = {
    ls.drop(l).take(k-l)
  }

  def test() {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
