package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/12/12
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
class P27 extends Solution {

  def group3[T](ls: List[T]): List[List[List[T]]] = {

    val seq = for {
      l1 <- ls.combinations(2)
      l2 <- ls.filterNot(l1.contains(_)).toList.combinations(3)
    } yield {
      List(l1, l2, ls.filterNot( e=> {l1.contains(e) || l2.contains(e)} ))
    }
    seq.toList
  }

  def group[T](ns: List[Int], ls: List[T]): List[List[List[T]]] = ns match {
    case n :: ns => ls.combinations(n).flatMap { c =>
      group(ns, ls.filterNot(c.contains(_)).toList) map { c :: _ }
    } toList
    case _ => List(Nil)
  }

  def test() {
    println(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))+"\n\n\n")
    println(group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))

  }

}
