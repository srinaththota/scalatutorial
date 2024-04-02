package basics

import scala.util.control.Breaks.{break, breakable}

object Basics extends App{

  /*
  * Scala identifiers are case-sensitive.
    Scala does not allows you to use keyword as an identifier.
    Reserved Words can’t be used as an identifier like $ etc.
    Scala only allowed those identifiers which are created using below four types of identifiers.
    There is no limit on the length of the identifier, but it is advisable to use an optimum length of 4 – 15 letters only.
    Identifiers should not start with digits([0-9]). For example “123geeks” is a not a valid Scala identifier.
  * */
  //valid identifiers
  var `name`="Srinath"
  val _age=22

  println(_age)
  println(`name`)

  /*
  DataType	Default value	Description
Boolean	False	True or False
Byte	0	8 bit signed value. Range:-128 to 127
Short	0	16 bit signed value. Range:-215 to 215-1
Char	‘\u000’	16 bit unsigned unicode character. Range:0 to 216-1
Int	0	32 bit signed value. Range:-231 to 231-1
Long	0L	64 bit signed value. Range:-263 to 263-1
Float	0.0F	32 bit IEEE 754 single-Precision float
Double	0.0D	64 bit IEEE 754 double-Precision float
String	null	A sequence of character
Unit	–	Coinsides to no value.
Nothing	–	It is a subtype of every other type and it contains no value.
Any	–	It is a supertype of all other types
AnyVal	–	It serve as value types.
AnyRef	–	It serves as reference types.
   */

  //-------------------
  //Pattern matching

  def test(x:String):String=x match {
    case "abc" => "abc"
    case "def" => "def"
    case _ => "12345"
  }
  println(test("abc"))

  //Enumeration in scala
 // println(Main.values)

  //scala ranges
  val range = (0,10,1)
  println(range)

  //Breakable
  breakable {
    for(i<- 0 until 10){
      if(i==4){
        break
      }else{
        println(i)
      }
    }
  }

  //Yeild

  val printYield = for(i<-0 until 11) yield i
  printYield.foreach(print)

  val a = Array( 8, 3, 1, 6, 4, 5)
  val printYielding = for(e<-a if e > 4) yield e
  println()
  printYielding.foreach(print)

  //exponent in scala
  val exp=2*4
  println("exponent is")
  print(" "+exp)
}

abstract class AbstractClass{
  def method()
}