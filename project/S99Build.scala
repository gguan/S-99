import sbt._
import sbt.Keys._

object S99Build extends Build {

  lazy val s99 = Project(
    id = "s-99",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "S-99",
      organization := "com.gguan",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
      // add other settings here
    )
  )
}
