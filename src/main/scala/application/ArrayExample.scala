package application

import scala.reflect.ClassTag

/**
  * Scala's Array is the same as Java's []. For example
  * Array[Int] is the same as int[].
  *
  * However, Scala Array's can use generics (i.e. Array[T]). You typically want to avoid
  * this as the conversion can be 3 to 4 times slower.
  *
  * Also, anywhere where a sequence is used you can pass an Array to. Furthermore
  * Arrays support all sequence operations like reverse.
  */
object ArrayExample extends CollectionsExample {

  // ClassTag is required here because T is erased at run time
  // ClassTag stores the erased  class of given type 'T'
  def evenElems[T: ClassTag](xs: Vector[T]): Array[T] = {
    val arr = new Array[T]((xs.length + 1) / 2)
    for (i <- xs.indices by 2) {
      arr(i / 2) = xs(i)
    }
    arr
  }

  // Again, need ClassTag for even U when calling evenElems
  // since evenElems DEMANDS ClassTag for it's parameter
  def wrap[U: ClassTag](xs: Vector[U]) = evenElems(xs)

  def basicArrayOperations(): Unit = {
    println("----- ARRAY EXAMPLE -----")

    val arrayOne = Array(1, 2, 3)
    println("Array: ")
    arrayOne foreach(println(_))

    println("Multiply all elements by 3 using map: ")
    arrayOne map (_ * 3) foreach(println(_))

    println("Find all odd elements using filter: ")
    arrayOne filter (_ % 2 != 0) foreach(println(_))

    println("Reverse the array: ")
    arrayOne.reverse foreach(println(_))

    println("----------\n")
  }

  def arrayGenericsExample(): Unit = {
    println("----- ARRAY GENERICS EXAMPLE -----")

    val array = evenElems(Vector(1, 2, 3, 4, 5))
    println("After running through the generic method: ")
    array foreach(println(_))

    val stringArray = wrap(Vector("this", "is", "a", "test", "run"))
    println("String example of using generic method: ")
    stringArray foreach(println(_))

    println("----------\n")
  }

  override def runExample(): Unit = {
    basicArrayOperations()
    arrayGenericsExample()
  }
}
