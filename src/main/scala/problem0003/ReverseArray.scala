package problem0003

//reverse array in place
object ReverseArray extends App{

  val arr=Array(1,2,3,5)
  new Reverse().method(arr).foreach(print(_))
}
