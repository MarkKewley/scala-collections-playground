package application

import scala.collection.mutable

/**
  * Some basic examples using mutable/immutable Maps.
  *
  * Notice the different ways we can create a Map, we can use
  * the tuple notation, or use the -> notation. The -> notation
  * is preferred according to the scala documentations as it is inherently
  * easier to read.
  */
object MapExample extends CollectionsExample {

  def immutableMap(): Unit = {
    println("---- IMMUTABLE MAP TEST ----")
    val map = Map(("key1", 1), ("key2", 2))
    map.keySet.foreach(key => println(s"$key => ", map(key)))
    // not possible
    // map += "key3" -> 3
    println("--------\n")
  }

  def mutableMap(): Unit = {
    println("---- IMMUTABLE MAP TEST ----")
    val map = mutable.Map("key1" -> 1, "key2" -> 2)
    println(map)

    map += "key3" -> 3
    println("After adding \"key3\" => 3: ")
    map.keySet.foreach(key => println(s"$key => ", map(key)))

    println("After removing \"key2\"")
    map -= "key2"
    map.keySet.foreach(key => println(s"$key => ", map(key)))

    // getOrElseUpdate only adds if the key doesn't exist, otherwise we return the value
    println("getOrElseUpdate ran on \"key3\" => 5: " + map.getOrElseUpdate("key3", 5))
    val returnedValue = map.getOrElseUpdate("key5", 5)
    println(s"After running getOrElseUpdate on key5 => 5: $map")
    println(s"The returnedValue for the previous call: $returnedValue")
    println("--------\n")
  }

  override def runExample(): Unit = {
    immutableMap()
    mutableMap()
  }
}
