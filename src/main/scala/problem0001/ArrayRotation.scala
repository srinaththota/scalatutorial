package problem0001

object ArrayRotation extends App{

  val arr = Array(1,2,3,4,5)
  val temp=arr(0)
  for(i<- 0 until arr.length-1){
    arr(i)=arr(i+1)
  }
  arr(arr.length-1)=temp

  arr.foreach(print(_))
}
