package basic

// 定义一个类，并且对name和age两个成员添加了getter函数
// scala将类视作可以和函数一样输入参数
class Person(var name: String, var age: Int) {
  //  Parameters of primary constructor in  (...)
  this.name = name + 1.toString

  def agePlus() = age += 1

  def this() = {
    this("test", 10)

  }

}
