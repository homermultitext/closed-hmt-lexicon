name := "lexicon"
organization := "org.homermultitext"
version := "0.0.1"
scalaVersion := "2.12.4"


licenses += ("GPL-3.0",url("https://opensource.org/licenses/gpl-3.0.html"))



resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith", "maven")
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "edu.holycross.shot" %% "kanones" % "0.3.0"
)

//tutTargetDirectory := file("docs")
//tutSourceDirectory := file("src/main/tut")
//enablePlugins(TutPlugin)
