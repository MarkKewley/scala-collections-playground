package application

import scala.collection.mutable

/**
  * Covers basic mutable/immutable Set examples as well as SortedSets
  */
object SetExample extends CollectionsExample {
  def immutableSet(): Unit = {
    println("---- IMMUTABLE SET TEST ----")
    val set = Set("hi", "hi", "chow")
    println("Immutable Set impossible to remove/add/update from: " + set)
    // not possible
    //    set += "hello"
    // However this is possible
    var newSet = Set("hi", "chow")
    println("Initial immutable set newSet: " + newSet)
    newSet += "yes"
    println("Immutable set that was just reassigned back to the variable newSet: " + newSet)
    println("--------\n")
  }

  def mutableSet(): Unit = {
    println("---- MUTABLE SET TEST ----")
    val mutableSet = mutable.Set("hi", "hi", "chow")
    println("Initial set, notice \"hi\" displays only once: " + mutableSet)
    mutableSet += "yes"
    // this actually changes the mutable set itself, notice we aren't reassigning
    // the val mutableSet
    println("Adding \"yes\" to the set: " + mutableSet)
    mutableSet -= "yes"
    println("Removing \"yes\" from the set: " + mutableSet)
    val anotherSet = mutable.Set("hi", "conquer", "yes")
    println("Intersection of our set with (hi, conquer, yes): " + (mutableSet & anotherSet))
    println("--------\n")
  }

  def sortedSet(): Unit = {
    println("---- SORTED SET TEST ----")
    val set = mutable.SortedSet(0, 5, 6, 1, 7, 20, 19, 10, -1)
    println("Sorted set, notice the sorting: " + set)
    println("Let's add 4 and see if it stays sorted: " + (set + 4))
    println("--------\n")
  }

  def customSortedSet(): Unit = {
    println("---- CUSTOM SORTED SET TEST ----")
    val myOrdering = Ordering.fromLessThan[String](_ > _)
    val sortedSet = mutable.TreeSet.empty(myOrdering)
    sortedSet += "a"
    sortedSet += "b"
    sortedSet += "f"
    println("Current custom sorted set: " + sortedSet)
    sortedSet += "d"
    println("Add d, now it is: " + sortedSet)
    println("--------\n")
  }

  override def runExample(): Unit = {
    immutableSet()
    mutableSet()
    sortedSet()
    customSortedSet()
  }
}
