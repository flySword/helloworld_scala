package basic

object Class_basic {

  def main(args: Array[String]): Unit = {

    //for test

    val counter = new Counter
    counter.increment()
    println(counter.current)
    // 此处建议修改类状态的函数（mutator）后面加括号
    // 不修改类状态的函数（accessor）不加括号

    counter.age = 10
    counter.age = -1
    println(counter.age)


    println(counter.getName_gs)


    val person = new Person("sdfj",11)
    person.agePlus()
    println(person.age)
    println(person.name)
    val person2 = new Person()
    println(person2.name)
  }
}
