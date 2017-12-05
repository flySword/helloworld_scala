package basic

object Function {

    def main(args: Array[String]): Unit = {

        // ### Function  与类无关的单独定义

        // 非递归函数的返回值类型可以不定义（通过右方值推断）
        // 最好不写return，函数最后为返回值
        def abs(x : Double) = if(x<0) -x else x

        // 默认参数
        def add(a:Int = 0, b:Int = 0) = a+b

        // 变长参数  貌似不允许函数重载...
        def addAll(a:Int *) = {
            var rlt = 0
            for (i <- a) rlt += i
            rlt
        }

        // 不返回值的函数 过程procedure
        // 没有 '='，返回值类型为 Unit
        def printProcedure (s:String): Unit = println(s)
        // 可以但不建议的一种方式  def printProcedure (s:String) = println(s)


    }
}
