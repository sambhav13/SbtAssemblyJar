organization := "com.appliedscala.tutorials.sbt"

scalaVersion := "2.11.7"

version := "1.0-SNAPSHOT"


resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies ++=  Seq(

  "joda-time" % "joda-time" % "2.9.4",
  "org.joda" % "joda-convert" % "1.8",
  "org.scalatest" % "scalatest_2.11" % "2.2.4"
)


