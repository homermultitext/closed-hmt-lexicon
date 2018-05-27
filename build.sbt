name := "lexicon"
organization := "org.homermultitext"
version := "0.0.1"
licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

tutTargetDirectory := file("docs")
tutSourceDirectory := file("src/main/tut")
enablePlugins(TutPlugin)
