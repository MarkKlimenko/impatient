package systems.vostok.cracking._1.is_unique

object SimpleIsUnique extends App {
  val value: String = "kgfkhgckytdotyfp"


  for (i = 0; ) {


  }

  value.foreach { letter =>
    var unique: Boolean = true

    value.foreach { insideLetter =>
      if(letter == insideLetter) {
        unique = false
      }
    }

    if(unique) {
      println(letter)
    }
  }
}
