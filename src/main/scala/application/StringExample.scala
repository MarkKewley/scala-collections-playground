package application

/**
  * I know, I know, Strings aren't part of collections...But! You
  * can perform Sequence operations on Strings by converting
  * Strings to sequences. That is what will be demonstrated in this
  * example.
  *
  * For example, if you look at reverse you will see that it calls on
  * {@link IndexSeqOptimized} to reverse it. So it builds a sequence and then
  * iterates backward eventually returning the string.
  */
object StringExample extends CollectionsExample {
  override def runExample(): Unit = {
    println("------- STRING EXAMPLE -------")

    val str = "Hello There"
    println("Reverse a string: " + str.reverse)
    println("Let's call map on string and uppercase each letter: " + str.map(_.toUpper))
    println("We can drop the first three elements: " + (str drop 3))
    println("We can slice the string to get a range of values: " + (str slice (6, str.length)))
    val seq: Seq[Char] = str
    println("Heck we can convert it to a Sequence of characters: " + seq + " => where this string is a: " + seq.getClass)

    println("--------------------\n")
  }
}
