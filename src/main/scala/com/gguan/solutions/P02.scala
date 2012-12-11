package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/10/12
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
class P02 extends Solution {

  def penultimate[T](list: List[T]) = {
    list.init.last
  }

  override def test() {
    println(penultimate(List(1,1,2,3,5,8)))
  }
}
