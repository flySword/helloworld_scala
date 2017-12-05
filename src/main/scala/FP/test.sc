import scala.reflect.internal.util.StringOps

var aa = Vector(1,2,3)
var bb = List(3,4,5)

val lol = List(List(1,2,3), List(3,4))
lol.flatten

lol.flatten.map(_ * 20).sorted.distinct //每个元素乘20，排序，去重

Some(lol.flatten)

Some(List()).isEmpty

val capitals = Map("France"->"Paris", "Japan"->"Tokyo", "China"->"Beijing")
capitals get "France"

capitals.get("sdf")

def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: Exception => None
  }
}

toInt("1122").get