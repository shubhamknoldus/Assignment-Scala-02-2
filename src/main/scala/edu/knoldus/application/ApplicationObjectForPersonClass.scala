package edu.knoldus.application

import edu.knoldus.person.classes.{Blogger, Gamer, Person, Trainer}
import org.apache.log4j.Logger

object ApplicationObjectForPersonClass extends App {




  val logger = Logger.getLogger(this.getClass)

  val initialMap = Map("Scala" -> 3, "Java" -> 4, "C" -> 11, "Kafka" -> 6)

  val obj = Blogger(initialMap)
  logger.info(obj.writeBlog)

/*
  def response(person: Person): String = {
    person match {
      case gameObj@Gamer(person) => gameObj.rollDice
      case trainer@Trainer(person) => trainer.takeAttendence
      case Blogger(person) =>
    }
  }*/
}
