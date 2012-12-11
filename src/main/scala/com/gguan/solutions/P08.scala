package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 */
class P08 extends Solution {

  def compress[T](list: List[T]): List[T] = {
    list.foldRight(List[T]()) { (c, e) => if(!e.isEmpty && c == e.head) e else c :: e }
  }


  def test() {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
