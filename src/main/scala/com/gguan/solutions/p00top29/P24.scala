package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
class P24 extends Solution {

  def lotto(n: Int, m: Int): List[Int] = {
    val p23 = new P23()

    p23.randomSelect(n, (1 to m).toList)
  }

  def test() {
    println(lotto(6, 49))
  }

}
