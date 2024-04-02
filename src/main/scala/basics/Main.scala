package basics

import java.util.concurrent.Executors
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

object Main extends App{


 // val first = Value("Thriller")
 // val second = Value("Horror")

  val incrementer:Int=>Int = x => x + 1

  val list = List(1,2,3).map(incrementer)

  println(list)
  //import scala.concurrent.ExecutionContext.Implicits.global // there will be overhead of spawning nested threads

  implicit val ec:ExecutionContext = ExecutionContext.fromExecutorService(Executors.newFixedThreadPool(8))

  //implicit val ec:ExecutionContext
  val aFuture = Future{42}

  aFuture.onComplete{
    case Success(value) => println(s"got the value $value")
    case Failure(exception) => println(s"exception is $exception")
  }

  aFuture.map(x=>{
    println("checking...")
    x + 1
  })

}
