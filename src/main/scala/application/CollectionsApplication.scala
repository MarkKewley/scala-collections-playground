package application

/**
  * Main application
  */
object CollectionsApplication {

  val Examples =
    List(
      SeqAndListExample,
      SetExample,
      MapExample,
      ArrayExample,
      StringExample,
      IteratorExample,
      JavaConversionExample,
      HighOrderFunctionsExample
    )

  def main(args: Array[String]): Unit = {
    Examples.foreach(_.runExample())
  }
}
