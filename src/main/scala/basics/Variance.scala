package basics

object Variance {

  class Animal
  class Dog extends Animal
  trait Vet[-A]{
    def heal(animal: Animal): Boolean
  }

 val myVet:Vet[Dog] = new Vet[Animal]{
   override def heal(animal: Animal): Boolean = true
 }
  def main(args:Array[String]):Unit={

  }
}
