package application

/**
  * Main application
  */
object CollectionsApplication {
  val examples =
    List(
      SeqAndListExample,
      SetExample,
      MapExample,
      HighOrderFunctionsExample
    )

  def main(args: Array[String]): Unit = {
    examples.foreach(_.runExample())
  }
}
