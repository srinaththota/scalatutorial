package problem0002

object ReverseArray {

  def main(args:Array[String]):Unit={
    var arr=Array(1,2,3,4,5,6)
    new Reverse().method(arr).foreach(print(_))
  }
}
