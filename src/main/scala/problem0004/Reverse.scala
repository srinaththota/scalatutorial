package problem0004

class Reverse {

  def method(arr:Array[Int]):Array[Int]={
    val end=arr.length-1
    def reversTailRec(arr:Array[Int],start:Int,end:Int):Array[Int]={
      if(start >= end) arr
      else {
        val temp=arr(start)
        arr(start)=arr(end)
        arr(end)=temp
        reversTailRec(arr,start+1,end-1)
      }
    }

    reversTailRec(arr,0,end)
  }
}
