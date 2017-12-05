package basic

object patternMatching {

  def main(args:Array[String]): Unit ={

    // ### value matching
    val ch = 'b'
    ch match{
      case 'a' => println("aaa")
      case 'c' => println("ccc")
//      case ccc => println ("cccc") // 此时会被捕获并将ch赋值给ccc，ccc成为一个变量参数
      case _ if ch > 'c' => println (ch)  // 守卫，捕获所有后添加boolean条件
      case _ => println("other")  // 用来捕获所有
    }

    // ### type matching
    val cch = "aldsj"
    cch match{
  //     case a:Int => println("int")
      case b:String => println("string")
  //      case _:BigInt => println("big int")
    }
    //scala 中建议使用match而非 isInstanceOf()

  //    case m:Map[String, Int]  //不能使用泛型的匹配，由于类型信息在里头擦过
  //  应该使用 case m:Map[_, _]

  }
}
