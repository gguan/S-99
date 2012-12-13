package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 2:12 PM
 * To change this template use File | Settings | File Templates.
 */
class P22 extends Solution {

  def range(n1: Int, n2: Int): List[Int] = {
    //val nums = for (i <- n1 to n2) yield i
    //nums.toList

    (n1 to n2).foldRight(List[Int]())(_ :: _)
  }

  def test() {
    println(range(4, 9))
  }

}
