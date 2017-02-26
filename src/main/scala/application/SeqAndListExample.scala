package application

import scala.collection.mutable

/**
  * Some basic examples using Seq which is Javas equivalent to List
  * and some mutable/immutable List which is Java equivalent to LinkedList
  */
object SeqAndListExample extends CollectionsExample {
  def immutableList(): Unit = {
    println("---- IMMUTABLE LIST TEST ----")
    val list = List(1, 2, 3)
    println("Immutable list, can't modify it whatsoever: " + list)
    // Doesn't work
    //    list += 4
    println("--------\n")
  }

  def mutableList(): Unit = {
    println("---- MUTABLE LIST TEST ----")
    val mutableList = mutable.MutableList(1, 2, 3)
    println("Mutable list initial list: " + mutableList)
    mutableList += 4
    println("Adding 4 to the list mutated it: " + mutableList)
    println("--------\n")
  }

  def sequence(): Unit = {
    println("---- SEQUENCE TEST ----")
    val seq = Seq(0, 1, 2, 3, 4, 5)
    println(seq)
    println("Reverse: " + seq.reverse)
    println("EndsWith the sequence (4,5) ?: " + (seq endsWith Seq(4, 5)))
    println("--------\n")
  }

  override def runExample(): Unit = {
    immutableList()
    mutableList()
    sequence()
  }
}
