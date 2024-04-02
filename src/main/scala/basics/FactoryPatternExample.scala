package basics

abstract class Car{

  def bookingPrice:Double
  def Brands:List[String]
  def availability:Int
  def book(noOfCars:Int)
}
object FactoryPatternExample {


  private class StandardCar extends Car{

    private var _availability = 100
    override def bookingPrice: Double = 20000

    override def Brands: List[String] = List("maruthi","tata")

    override def availability: Int = _availability

    override def book(noOfCars: Int): Unit = {
      _availability = _availability - noOfCars
    }
  }
  private class LuxuryCar extends Car{

    private var _availability = 100
    override def bookingPrice: Double = 20000

    override def Brands: List[String] = List("maruthi","tata")

    override def availability: Int = _availability

    override def book(noOfCars: Int): Unit = {
      _availability = _availability - noOfCars
    }
  }
  private class DeluxCar extends Car{

    private var _availability = 100
    override def bookingPrice: Double = 20000

    override def Brands: List[String] = List("maruthi","tata")

    override def availability: Int = _availability

    override def book(noOfCars: Int): Unit = {
      _availability = _availability - noOfCars
    }
  }
  val STANDARD = 1
  val DELUX = 2
  val LUXURY = 3
  def apply(carType:Int):Car={
        carType match {
          case STANDARD => new StandardCar()
          case DELUX => new DeluxCar()
          case LUXURY => new LuxuryCar()
        }
  }
  def main(args:Array[String]):Unit={

    val s = FactoryPatternExample(STANDARD)
    println(s.Brands)
  }
}
