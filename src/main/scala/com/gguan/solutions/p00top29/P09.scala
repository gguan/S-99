package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
class P09 extends Solution {

  def pack[T](ls: List[T]): List[List[T]] = {
    ls.foldRight(List[List[T]]()) { (c, e) => (c, e) match {
        case (elem, h :: rest) => if(elem == h.head) (elem :: h) :: rest else List(elem) :: h :: rest
        case (elem, _) => List(List(elem))
      }
    }
  }

  def test() {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
