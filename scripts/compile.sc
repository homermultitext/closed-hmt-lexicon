// Compile a morphological parser

import edu.holycross.shot.kanones.builder._
import better.files._
import java.io.{File => JFile}
import better.files.Dsl._

val compiler = "/usr/local/bin/fst-compiler-utf8"
val fstinfl = "/usr/local/bin/fst-infl"
val make = "/usr/bin/make"


def compile(repo: String =  "../kanones") = {
  val tabulae = File(repo)
  val datasets = "."
  val c = "kanones"
  val conf =  Configuration(compiler,fstinfl,make,datasets)

  try {
    FstCompiler.compile(File(datasets), File(repo), c, conf, true)
    val tabulaeParser = repo/"parsers/kanones/greek.a"
    val localParser = File("parser/greek.a")
    cp(tabulaeParser, localParser)
    println("\nCompilation completed.  Parser greek.a is " +
    "available in directory \"parser\"\n\n")
  } catch {
    case t: Throwable => println("Error trying to compile:\n" + t.toString)
  }

}


println("Compile a morphological parser from kanónes")
println("repository in adjacent directory:")
println("\n\tcompile()\n")
println("or in a specified directory:")
println("\n\tcompile(\"KANONES__DIRECTORY\" )\n")
