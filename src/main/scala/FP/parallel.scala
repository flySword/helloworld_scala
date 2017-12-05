package FP

object parallel {

  // 与传统的as.foldLeft(0)(_ + _)实现不同
  // 通过这种划分求和方式能够实现代码并行
  def sum(as: IndexedSeq[Int]): Int = {
    if (as.size <= 1) as.headOption getOrElse 0
    else {
      val (l, r) = as.splitAt(as.length / 2)
      sum(l) + sum(r)
    }
  }



  // sum并行计算版本  貌似Par不是自带的库，不能运行
//  def unit[A](a: => A): Par[A]
//  def get[A](a: Par[A]): A
//
//  def sum(as: IndexedSeq[Int]): Int =
//    if (as.size <= 1) as.headOption getOrElse 0
//    else {
//      val (l,r) = as.splitAt(as.length/2)
//      val sumL: Par[Int] = Par.unit(sum(l))
//      val sumR: Par[Int] = Par.unit(sum(r))
//      Par.get(sumL) + Par.get(sumR)
//    }

  def main(args: Array[String]): Unit = {

  }

}
