package application

import collection.JavaConverters._
import collection.mutable._

/**
  * Sometimes you may need to convert from a Java collection
  * to a scala. Here are som eexamples of doing so.
  */
object JavaConversionExample extends CollectionsExample {
  override def runExample(): Unit = {
    println("----- CONVERTING TO/FROM JAVA EXAMPLE -----")

    val javaList: java.util.List[Int] = ArrayBuffer(1, 2, 3).asJava
    println("Java list: " + javaList + " => check the class: " + javaList.getClass)

    // convert back
    val buf: Seq[Int] = javaList.asScala
    println("Back to a scala sequence: " + buf + " => check the class: " + buf.getClass)

    val javaMap: java.util.Map[String, Int] = HashMap("abc" -> 1, "hello" -> 2).asJava
    println("Java map: " + javaMap + " => check the class: " + javaMap.getClass)

    println("-------------------\n")
  }
}
