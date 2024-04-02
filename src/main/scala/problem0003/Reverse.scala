package problem0003

class Reverse {

  def method(arr:Array[Int]):Array[Int]={
    var start=0
    var end=arr.length-1

    var temp=0
    while(start < end){
      temp=arr(start)
      arr(start)=arr(end)
      arr(end)=temp
      start += 1
      end -= 1
    }
    arr
  }
}
