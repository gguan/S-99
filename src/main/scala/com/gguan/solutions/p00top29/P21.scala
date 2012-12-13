package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
class P21 extends Solution {

  def insertAt[T](e: T, p: Int, ls: List[T]): List[T] = {
     ls.take(p) ::: e :: ls.drop(p)
  }

  def test() {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }

}
