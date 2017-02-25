import scala.collection.mutable._

/**
  * Main application
  */
object CollectionsApplication {
  def immutableList(): Unit = {
    println("---- IMMUTABLE LIST TEST ----")
    val list = List(1, 2, 3)
    println(list)
    // Doesn't work
//    list += 4
    println("--------\n")
  }

  def mutableList(): Unit = {
    println("---- MUTABLE LIST TEST ----")
    val mutableList = MutableList(1, 2, 3)
    println(mutableList)
    mutableList += 4
    mutableList.foreach(arg => println(arg))
    println("--------\n")
  }

  def immutableSet(): Unit = {
    println("---- IMMUTABLE SET TEST ----")
    val set = scala.collection.immutable.Set("hi", "hi", "chow")
    set.foreach(arg => println(arg))
    // not possible
//    set += "hello"
    println("--------\n")
  }

  def mutableSet(): Unit = {
    println("---- MUTABLE SET TEST ----")
    val mutableSet = Set("hi", "hi", "chow")
    println(mutableSet)
    mutableSet += "yes"
    mutableSet.foreach(arg => println(arg))
    println("--------\n")
  }

  def immutableMap(): Unit = {
    println("---- IMMUTABLE MAP TEST ----")
    val map = scala.collection.immutable.Map(("key1", 1), ("key2", 2))
    map.keySet.foreach(key => println("" + key + " => " + map(key)))
    // not possible
    // map += "key3" -> 3
    println("--------\n")
  }

  def mutableMap(): Unit = {
    println("---- IMMUTABLE MAP TEST ----")
    val map = Map("key1" -> 1, "key2" -> 2)
    println(map)
    map += "key3" -> 3
    map.keySet.foreach(key => println("" + key + " => " + map(key)))
    println("--------\n")
  }

  def main(args: Array[String]): Unit = {
    immutableList()
    mutableList()

    immutableSet()
    mutableSet()

    immutableMap()
    mutableMap()
  }
}
