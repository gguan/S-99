package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
class P26 extends Solution {

  def combinations[T](k: Int, ls: List[T]): List[List[T]] = {
    ls.combinations(k).toList
  }

  def test() {
    println(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
