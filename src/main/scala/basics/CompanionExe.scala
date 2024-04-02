package basics

import basics.Companion.calculate

object CompanionExe extends App{

  val companionVariable1 = new Companion(10)
  println(companionVariable1.method())
  val companionVariable2 = new Companion(20)
  println(companionVariable2.method())

}

class Companion(init:Int) {

  def method():Int={
    init * calculate()
  }
}

object Companion{
  def calculate():Int={
    10
  }
}
