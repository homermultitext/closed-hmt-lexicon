// generate markdown pages from CEX files

import java.io.File
import java.io.PrintWriter
import scala.io.Source


val dir = new File("src/main/tut/stemclasses")

val fileVector = dir.listFiles.filter(_.isFile).toVector
val cex = fileVector.filter(_.getName.endsWith(".cex"))

def hdr(line: String) = {
  val divStr = "| :------------- "
  val cols = line.split("#")
  val labels = "| " + cols.mkString(" | ")  + " | \n"
  val separator = for (i <- 1 to cols.size) yield {
    divStr
  }
  labels + separator.mkString + " | \n"
}

def rows(lines: Vector[String]): String = {

  val md = for (ln <- lines) yield {
    val cols = ln.split("#")
    "| " + cols.mkString(" | ")  + " |"
  }
  md.mkString("\n")
}
def tableToMd(v: Vector[String]) : String = {
   v.size match {
    case 0 => hdr(v.head)
    case _ : Int => hdr(v.head) + rows (v.tail) + "\n"
  }
}


def stemTables = {
  for (f <- cex) {
    val mdName = f.getName.replaceFirst(".cex", ".md")
    val lines = Source.fromFile(f).getLines.toVector
    val outFile = new File(dir, mdName)
    new PrintWriter(outFile ) { write(tableToMd(lines)); close;}
    println("Wrote " + outFile)
  }
}
