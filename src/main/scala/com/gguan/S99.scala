package com.gguan

import main.scala.com.gguan.solutions.Solution

object S99 extends App {
	println("Hello, S-99")
	if (args.length < 1) println("Please add a solution number to run.")
	else {
		val sc = Class.forName("main.scala.com.gguan.solutions." + args(0))
		val solution = sc.newInstance().asInstanceOf[Solution]
		solution.test
	}
  
}
