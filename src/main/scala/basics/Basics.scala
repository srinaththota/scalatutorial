package basics

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
}
