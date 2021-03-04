name := "scala_test_2"

version := "0.1"

scalaVersion := "2.13.5"
libraryDependencies in scala_test_2 ++= Seq(
  "org.scalatest" %% "scalatest" % "latest.integration" % "test"
)
