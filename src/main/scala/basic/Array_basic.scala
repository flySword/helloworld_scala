package basic

object Array_basic {
  def main(args: Array[String]): Unit = {

    // ### Array

    // #### fixed-length
    val nums = new Array[Int] (10)
    nums(0) = 10  // 使用( )访问
    val numss = Array(1,2,3)
    // get multiple element
    numss.slice(1,4)

    // variable-length     using ArrayBuffer
    import scala.collection.mutable.ArrayBuffer
    val b = ArrayBuffer[Int]()  // Or  new ArrayBuffer[Int]
    b += 1
    b += (1, 2, 3, 5)
    b ++= Array[Int](1,12,3)
    b ++= Array(8, 13, 21)
    b.toArray


    // ### two dimenstions
    val twoDimArray = Array.ofDim[Double](3,3)
    twoDimArray(2)(2) = 3
    // get one column
    println ( twoDimArray.map(_(2))) // get 2nd column
    // get multiple columns
    twoDimArray.map(_.slice(2,4))

  }
}
