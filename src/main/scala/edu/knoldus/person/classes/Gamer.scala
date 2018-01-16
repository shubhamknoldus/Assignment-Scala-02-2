package edu.knoldus.person.classes

import java.util.Random

case class Gamer(name: String) extends Person {

  def rollDice: String = {
    rollDiceHelper(0)
  }

  private def returnDiceFace(): Int = {
    val rn = new Random()
    val max = 6
    rn.nextInt(max) + 1
  }

  private def checkDice: Boolean = {
    if (returnDiceFace() == 1 || returnDiceFace() == 6) {
      true
    } else {
      false
    }
  }

  private def rollDiceHelper(count: Int): String = {

    if (count == 3) {
      s"Great work ${this.name} you won\n"
    } else {
      if (checkDice) {
        rollDiceHelper(count + 1)
      } else {
        s"Sorry ${this.name}!!! Better luck next time\n"
      }
    }
  }
}
