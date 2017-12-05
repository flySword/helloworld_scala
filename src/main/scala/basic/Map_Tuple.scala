package basic

object Map_Tuple {

  def main(args: Array[String]): Unit = {

    // mutable 与 immutable 两种，一种内容可改变，一种内容不可变
    // val and var，val类型不能修改指向的对象，但可以修改内容

    // ### Maps
    // Maps are collections of key/value pairs.

    // definition
    // content can't be changed
    val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    val scores1 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
    // mutable map
    val scoress = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
    // blank map
    val scores_blank = new scala.collection.mutable.HashMap[String, Int]

    // Map operation
    println(scoress("Alice"))

    scoress += ("fly" -> 10, "wind" -> 10)
    scoress -= "Alice"


    // with java
    import scala.collection.JavaConversions.mapAsScalaMap
    val scoresss: scala.collection.mutable.Map[String, Int] =
      new java.util.TreeMap[String, Int]


    // ### tuples
    val t1 = (1,2, "a")  // Tuple3[Int,Int,String]

    t1._3 // 直接访问第三个对象



    // ### zip

    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)  // Array(("<", 2), ("-", 10), (">", 2))





  }

}
