package edu.knoldus.person.classes

import scala.util.Random

case class Trainer(name: String) extends Person {
  def takeAttendence: String = {
    val totalStrength = 50
    val random = new Random()
    val strength = random.nextInt(totalStrength)
    strength match {
      case n if n == 0 => s"Hello ${this.name}!! All students are absent today\n"
      case n if n > 0 => s"Hello ${this.name}!! $n students are present today\n"
      case n if n < 0 => takeAttendence
    }

  }
}
