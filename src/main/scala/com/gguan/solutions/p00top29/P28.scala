package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 5:36 PM
 * To change this template use File | Settings | File Templates.
 */
class P28 extends Solution {

  def lsort[T](ls: List[List[T]]): List[List[T]] = {
    ls.sortBy(_.length)
  }

  def lsortFreg[T](ls: List[List[T]]): List[List[T]] = {
    ls.groupBy(_.length).toList.sortBy(_._2.length) flatMap (_._2)
  }

  def test() {
    println(lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))))
    println(lsortFreg(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))))
  }

}
