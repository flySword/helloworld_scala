/**
  * - list all ".txt" ".md" files in a directory  递归得到目录下所有的.txt .md文件
  * - count all the words
  * - search a word whether in all files
  *
  */




package smallPrj


import java.io.{BufferedReader, File, FileReader}

import scala.io.Source

import java.nio.charset.Charset
import java.nio.charset.CodingErrorAction


object WordCount_Search {
  def main(args: Array[String]): Unit = {

    // ### list the txt and md in the path
    val path = new File("G:\\lzp_personal_data\\study_data\\itNote")
    def getFile(file:File): Array[File] ={
      file.listFiles().filter(! _.isDirectory)
        .filter(t => t.toString.endsWith(".txt") || t.toString.endsWith(".md")) ++
      file.listFiles().filter(_.isDirectory).flatMap(getFile)
    }
  //  getFile(path).foreach(println)


    val decoder = Charset.forName("UTF-8").newDecoder()
    decoder.onMalformedInput(CodingErrorAction.IGNORE)
    // ###  word count
    getFile(path).flatMap(f =>Source.fromFile(f)(decoder).getLines())
      .flatMap(_.split(" "))
      .map((_,1))
      .groupBy(_._1)
      .map({ case (group: String, traversable) => traversable.reduce{(a,b) => (a._1, a._2 + b._2)} })
    // scala 中没有reduceByKey
   //   .foreach(println)


    // ### search in all file
    def searchFiles( s:String, path :File): Unit ={
      getFile(path).collect( {
        case f:File if Source.fromFile(f)(decoder).getLines.mkString(" ").contains(s)
        => f  }) //貌似使用case时必须加{ }
        .foreach(println)
    }
    searchFiles("工具", path)

//      .flatMap(_.split(" "))
//      .map((_,1))
//      .groupBy(_._1)
//      .map({ case (group: String, traversable) => traversable.reduce{(a,b) => (a._1, a._2 + b._2)} })
//      .foreach(println)




//    val file=Source.fromFile("G:\\lzp_personal_data\\study_data\\itNote\\numpy_note\\result.txt")
//    for(line <- file.getLines)
//    {
//      println(line)
//    }
//    file.close
  }

}
