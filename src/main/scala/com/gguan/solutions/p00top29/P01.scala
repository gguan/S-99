package main.scala.com.gguan.solutions

class P01 extends Solution {

  def last[T](list: List[T]) = list.last

	override def test() {
    println(last(List(1,1,2,3,5,8)))
  }
}
