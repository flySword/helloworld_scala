package basic

import basic.TrafficLightColor.Value
import basic.appObj.args

// for Companion Object
class Object_basic{
  var num = 0
  def getNum = { num = Object_basic.num}
}

object Object_basic {

  // object的作用
  // scala 没有静态方法与字段，object相当于某个类的单个实例
  // 主要用于三个方面：
  // 1. 存放工具函数与常量
  // 2. 高效共享单个不可变实例
  // 3. 单例模式

  // object 本质上有类的所有特性，但不能提供构造器参数


  //  ### Companion Objects
  // object与class的名相同
  // 可以相互调用私有对象，需要定义在同一个源文件
  private var num = 0


  // ### apply 方法
  // object(parameter1, parameter2, ...)
  // 不使用constructor能够省去new函数
  def main(args: Array[String]): Unit = {
    // 典型的object apply方法用于 Array
    Array("a", "b", "c")

    // Array(100) 与 new Array(100)
    println((Array(10))(0)) // 结果为10，Array(10)是包含一个10的数组
    println((new Array(10))(0))// 结果为null，new Array(10)是10个null数组

  }

}



// ### 扩展类
object aa extends Object_basic{

}

// ### application object
object appObj extends App{
  //  def main(args: Array[String]): Unit = {
  println (args(0))  //调用args参数的方式
  //}
}

// ### Enumerations 枚举

object TrafficLightColor extends Enumeration {
  val Red = Value(0, "Stop")
  val Yellow = Value(10) //  Name  "Yellow"
  val Green = Value("Go") //  ID 11
}
