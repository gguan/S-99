package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */

class P23 extends Solution {

  def randomSelect[T](n: Int, ls: List[T]): List[T] = {
    import scala.util.Random

    val p20 = new P20()

    def randomRemove[T](ls: List[T]): List[T] = {
      if (ls.length > n) randomRemove(p20.removeAt(Random.nextInt(ls.length), ls)._1)
      else ls
    }

    randomRemove(ls)
  }

  def test() {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

}
