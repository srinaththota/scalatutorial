package problem0004

object ReverseArray extends App{

  val arr=Array(1,2,3,4,5,6,7,8,9)
  new Reverse().method(arr).foreach(print(_))
}
