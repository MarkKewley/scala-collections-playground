package application

import java.util.NoSuchElementException

/**
  * This isn't a collection, but rather a way to access the elements
  * of a collection one by one.
  */
object IteratorExample extends CollectionsExample{

  /**
    * When calling methods like foreach on an iterator, it will
    * leave the iterator at the END, thus when calling next() on an iterator
    * you will receive an {@link NoSuchElementException}
    */
  def showExceptionUsingForEach(): Unit = {
    println("----- ITERATOR EXCEPTION EXAMPLE -----")

    try {
      val list = List(1, 2, 3)
      val it = list.iterator
      it foreach println
      // error should occur here!
      it.next()
    } catch {
      case e: NoSuchElementException => println("NoSuchElementException was encountered!")
      case _ => println("UNKNOWN EXCEPTION CHECK CODE")
    }

    println("------------------\n")
  }

  override def runExample(): Unit = {
    showExceptionUsingForEach()
  }
}
