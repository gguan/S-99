package main.scala.com.gguan.solutions

/**
 * Created with IntelliJ IDEA.
 * User: gguan
 * Date: 12/11/12
 * Time: 11:55 PM
 * To change this template use File | Settings | File Templates.
 */
class P19 extends Solution {

  def rotate[T](n: Int, ls: List[T]): List[T] = {
    val (l1, l2) = ls.splitAt(if (n>0) n else ls.length+n)
    l2 ::: l1
  }

  def rotate2[A](i: Int, list: List[A]): List[A] = {
    val (start, end) =  if(i >= 0 ){
      (list.drop(i), list.take(i))
    } else {
      (list.takeRight(i.abs), list.dropRight(i.abs))
    }
    start ::: end
  }

  def test() {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
