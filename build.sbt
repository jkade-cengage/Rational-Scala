name := "Rational-Scala"

version := "1.0.0"

scalaVersion := "2.10.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()

org.scalastyle.sbt.ScalastylePlugin.Settings