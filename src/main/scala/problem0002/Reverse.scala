package problem0002

class Reverse {

  def method(arr:Array[Int]):Array[Int]={
    val reverse = new Array[Int](arr.length)
    println(reverse.length)
    for(i<- 0 until arr.length){
      reverse(arr.length-1-i)=arr(i)
    }
    reverse
  }
}
