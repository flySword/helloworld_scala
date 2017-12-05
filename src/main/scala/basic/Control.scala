package basic

object Control {

    def main(args: Array[String]): Unit = {

        // ### if
        if (2 > 1) println("2>1")

        var s = if(3>2) 3 else 2  //能够直接赋值

        // ### while
        var i = 1
        while(i<3) {
            println(i)
            i+=1
        }

        do{
            println(i)
            i+=1
        }while (i < 5)


        // for

        for (x <- 0 to 3){  // 此处不需要var声明，遍历集合数据类型
            println(x)
        }

        // 上面的 0 to 3 得到的是 {0,1,2,3} 四个数的集合，
        // util可以去除上界，以便于数组、字符串等的访问
        for (x <- 0 until 3){
            println(x)
        }

        //break 实现
        import scala.util.control.Breaks._
        breakable{
            for (x <- 0 until 10){
                if (x > 3) break
            }
        }

        // 高级for
        for(i <- 1 to 3; j<- 1 to 3; if i ==j ) println(i*j)

        // yield 产生集合
        println( for(i<- 1 to 10) yield i )




    }
}
