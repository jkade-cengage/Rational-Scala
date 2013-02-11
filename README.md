Rational-Scala
================

Scala exercise for Cengage's Friday afternoon polyglot jams. This will introduce you to TDD using Scala and ScalaTest

Overview
--------
Rational-Scala is an exercise created for Cengage's "Friday Afternoon Polyglot Jam".  The intent is to
experience functional programming using Scala as well as some of the interesting features of the Scala language
including operator overload.  

Getting Started
---------------
- clone the project from GitHub (git://github.com/mikesmithson/Rational-Scala.git)
- Install sbt (http://www.scala-sbt.org/)
- run sbt from the cloned project
- type "test" from the sbt prompt

Running "test" from sbt will download dependencies (including Scala), compile the code and run the tests.  
You should be rewarded with the message "[success]" and see no failed tests.

You are free to use the text editor of your choice.  If you want to use eclipse, you can import the sbt project --
but first, you need to "eclipsify" the project.  Just type "eclipse" from the sbt prompt.  You should be rewared
with the message "[info] Successfully created Eclipse project files for project(s)".  Now you can import the project
into eclipse.  You will also want these eclipse plug-ins for eclipse:  Scala IDE for Eclipse, and ScalaTest for Scala IDE.
If you use Intellij-IDEA, just type "gen-idea" at the sbt prompt.

Plugin Sites for Eclipse
-------------------------
Scala IDE Ecosystem (Includes ScalaTest): http://download.scala-ide.org/ecosystem/dev-2.0-2.9/site/ 
Sbt Console for Eclipse: http://scala-ide.dreamhosters.com/nightly-update-sbtconsole-scalaide21-29/site/


Problem Overviews
----------------
Your task is to test-drive the Rational.scala class using the spec RationalSpec.scala as your guide for the typical
red-green-refactor cadence. Sbt has the nice feature of ~test that listens for changes in your test/production code
and re-runs all of your tests when you make a change. 


Spoiler Alert -- the file RationalSolution.txt contains my solution. This is meant as a guide only. Your mileage
may vary.

     
Getting Help
------------
Feel free to log an issue if you are not sure. Rational.scala is taken directly from Martin Odersky's excellent book -- "Programming 
in Scala, Second Edition". 