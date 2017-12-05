package basic

object collection_oper {

  // ### predicate 断言（谓语）
  def predicate_fun = {
    // A predicate is simply a method, function, or anonymous function that takes one or more
    // parameters and returns a Boolean value.

    // 几个简单的predicate
    def isEven(i: Int) = if (i % 2 == 0) true else false
    //(i: Int) => i % 2 == 0
    // _ % 2 == 0

    // predicate 可以用于 filter 等函数
    val list = List.range(1, 10)
    val events = list.filter(_ % 2 == 0)
    println(events)

  }

  // ### some simple collection
  def simple_collection: Unit ={
    val x = IndexedSeq(1,2,3)
    val seq = scala.collection.immutable.LinearSeq(1,2,3)

    val m = Map(1 -> "a", 2 -> "b")
    val m_mutable = collection.mutable.Map(1 -> "a", 2 -> "b")

    val set = Set(1, 2, 3, 1)
    val s = collection.mutable.Set(1, 2, 3)
  }

  // ### collection classify
  // 主要分三类 Sequence、Map、Set

  // #### Sequence

  // 最常用Sequence
  // [immutable] list 链表（访问单个元素为O(n)    array数组
  // [mutable] ListBuffer   ArrayBuffer

  //  Main immutable sequence choices
  // [indexedSeq] 数组型，Range, String, Vector
  // [LinearSeq] 链表型  List, Queue, Stack, Stream


  // Map与Set类型的collection省略


  // ### collection method

//  Filtering methods
//    Methods that can be used to filter a collection include collect, diff, distinct,
//  drop,  dropWhile,  filter,  filterNot,  find,  foldLeft,  foldRight,  head,
//  headOption,  init,  intersect,  last,  lastOption,  reduceLeft,  reduceRight,
//  remove, slice, tail, take, takeWhile, and union.

//  Transformer methods
//    Transformer methods take at least one input collection to create a new output
//  collection, typically using an algorithm you provide. They include +, ++, −, −−, diff,
//  distinct,  collect,  flatMap,  map,  reverse,  sortWith,  takeWhile,  zip,  and
//  zipWithIndex.

//  Grouping methods
//    These methods let you take an existing collection and create multiple groups from
//  that one collection. These methods include groupBy, partition, sliding, span,
//  splitAt, and unzip.

//  Informational and mathematical methods
//    These  methods  provide  information  about  a  collection,  and  include  canEqual,
//  contains,  containsSlice,  count,  endsWith,  exists,  find,  forAll,  has-
//    DefiniteSize,  indexOf,  indexOfSlice,  indexWhere,  isDefinedAt,  isEmpty,
//  lastIndexOf, lastIndexOfSlice, lastIndexWhere, max, min, nonEmpty, product,
//  segmentLength,  size,  startsWith,  sum.  The  methods  foldLeft,  foldRight,
//  reduceLeft, and reduceRight can also be used with a function you supply to obtain
//    information about a collection.

//  Others
//  A  few  other  methods  are  hard  to  categorize,  including  par,  view,  flatten,
//  foreach, and mkString. par creates a parallel collection from an existing collection;
//  view creates a lazy view on a collection (see Recipe 10.24); flatten converts a list
//    of lists down to one list; foreach is like a for loop, letting you iterate over the
//  elements in a collection; mkString lets you build a String from a collection.


  // mutable collection methods
//  c += x Adds the element x to the collection c.
//  c += (x,y,z) Adds the elements x, y, and z to the collection c.
//  c1 ++= c2 Adds the elements in the collection c2 to the collection c1.
//  c −= x Removes the element x from the collection c.
//  c −= (x,y,z) Removes the elements x , y, and z from the collection c.
//  c1 −−= c2 Removes the elements in the collection c2 from the collection c1.
//  c(n) = x Assigns the value x to the element c(n).
//  c clear Removes all elements from the collection.
//  c remove n         Removes the element at position n, or the elements -
//  c.remove(n, len)   beginning at position n and continuing for length len.

//  that's too much   ......


  def main(args: Array[String]): Unit = {



  }

}
