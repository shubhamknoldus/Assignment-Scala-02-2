package edu.knoldus.person.classes

import org.apache.log4j.Logger

import scala.util.Random

case class Blogger(blogList: Map[String, Int]) extends Person {

  val logger = Logger.getLogger(this.getClass)

  def writeBlog: String = {
    val upadtedBlogList = writeBlogHelper(blogList, 0)
    val maxCount = upadtedBlogList.values.toList.max
   val favourite = for(blog <- upadtedBlogList if blog._2 == maxCount) yield {
      blog._1
    }
    s"Favourite Blog is ${favourite.mkString} with count $maxCount\n"
  }

  private def writeBlogHelper(listOfBlogs: Map[String, Int], count: Int): Map[String, Int] = {
    val sum = 5
    if (count == sum) {
      listOfBlogs
    } else {
      val random = new Random()
      val keysWithIndexes = listOfBlogs.keys.toList.zipWithIndex
      val rand = random.nextInt(keysWithIndexes.length)
      val keyWithIndex = for(tupleWithKey <- keysWithIndexes if tupleWithKey._2 == rand) yield tupleWithKey
      keyWithIndex match {
        case head :: tail =>
          val numberOfBlogs = listOfBlogs.get(head._1).fold(sum)(identity)
          val updatedBlog = listOfBlogs + (head._1 -> (numberOfBlogs + 1))
          writeBlogHelper(updatedBlog, count + 1)
      }
    }
  }
}
