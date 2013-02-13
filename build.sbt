name := "Rational-Scala"

version := "1.0.0"

scalaVersion := "2.10.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()

seq(ScctPlugin.instrumentSettings : _*)

org.scalastyle.sbt.ScalastylePlugin.Settings