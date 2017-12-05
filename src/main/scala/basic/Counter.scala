package basic

class Counter {
  // ### 简单使用
  private var value = 0 //  You  must  initialize the ﬁeld
  def increment() { value += 1 } //  Methods are public by default
  def current(): Int = value


  // ### getter and setter
  private var _age:Int = 0
  def age = _age  // getter
  // setter 函数名为age_=，不能分开，使用时不用加
  def age_= (newValue: Int) { if (newValue > 0) _age = newValue }

  // scala 会对var类型的对象的生成默认的getter and setter函数
  // 对val类型的对象生成默认的getter函数
  // 使用时还是需要覆盖，不知道此处的自动生成加覆盖的意义何在？


  //  ### 对象私有，不同的对象之间不能相互访问
  private [this] var value_obj_private = 0

  // 当对象作为方法参数时，下面对另一个对象中的[对象私有成员]访问不可行
  //  def isLess(other: Counter) = value < other.value_obj_private


  // ### java Bean类型的getter and setter
  // java的命令一般为 getName and setName，与scala不一致
  // 如果需要生成java类型的getter and setter 函数，需要加入Bean标签

  import scala.beans.BeanProperty
  @BeanProperty var name_gs = 1
  // will generates  four  methods:
  //  1. name: String
  //  2. name_=(newValue: String): Unit
  //  3. getName(): String
  //  4. setName(newValue: String): Unit


  //  ### Auxiliary Constructors
  def this (newValue:Int){
    this()
    this.value = newValue
  }

  def this (newValue:Int, newAge:Int){
    this(newValue)
    this.age = newAge
  }

}
