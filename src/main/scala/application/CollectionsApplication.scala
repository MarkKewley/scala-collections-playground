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
      HighOrderFunctionsExample
    )

  def main(args: Array[String]): Unit = {
    Examples.foreach(_.runExample())
  }
}
