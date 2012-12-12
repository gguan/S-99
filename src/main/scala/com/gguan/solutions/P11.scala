package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
class P11 extends Solution {

  def encodeModified[T](ls: List[T]): List[Any] = {
    val p09 = new P09

    p09.pack(ls).map(e => e match {
      case x :: Nil => x
      case x :: y => (e.length, e.head)
      case _ => null
    })
  }

  def test() {
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
