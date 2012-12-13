package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 2:44 PM
 * To change this template use File | Settings | File Templates.
 */
class P25 extends Solution {

  def randomPermute[T](ls: List[T]) = {
    import scala.util.Random
    ls.foldLeft(List[T]()) { (l, e) => if (Random.nextBoolean()) e :: l else l ::: List(e) }
  }

  def test() {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
