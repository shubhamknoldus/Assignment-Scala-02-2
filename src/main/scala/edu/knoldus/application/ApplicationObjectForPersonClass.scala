package edu.knoldus.application

import edu.knoldus.person.classes.{Blogger, Gamer, Person, Trainer}
import org.apache.log4j.Logger

object ApplicationObjectForPersonClass extends App {

  val logger = Logger.getLogger(this.getClass)
  val initialMap = Map("Scala" -> 3, "Java" -> 4, "C" -> 11, "Kafka" -> 6)
  val bloggerObject = Blogger(initialMap)
  val gamerObject = Gamer("Shubham")
  val trainerObject = Trainer("Prabhat")

  def response(person: Person): String = {
    person match {
      case gameObj@Gamer(person) => gameObj.rollDice
      case trainer@Trainer(person) => trainer.takeAttendence
      case blogger@Blogger(person) => blogger.writeBlog
    }
  }

  logger.info(s"${response(gamerObject)}\n\n${response(trainerObject)}\n\n${response(bloggerObject)}")
}
