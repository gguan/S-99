package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 3:56 AM
 * To change this template use File | Settings | File Templates.
 */
class P04 extends Solution {

  def length[T](list: List[T]):Int = {
    list.foldLeft(0){ (c, _) => c + 1 }
  }

  def test {
    println(length(List(1, 1, 2, 3, 5, 8)))
  }
}
