import scala.util.Random

val initialMap = Map("Scala" -> 3, "Java" -> 4, "C" -> 11, "Kafka" -> 6)


val x = initialMap.keys.zipWithIndex



val y = new Random()


y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)
y.nextInt(1)


val bloglist = Map("Scala" -> 3, "Java" -> 4, "C" -> 11, "Kafka" -> 6)

y.nextInt(bloglist.keys.toList.length)


def writeBlogHelper(listOfBlogs: Map[String, Int], count: Int): Map[String, Int] = {

  val sum = 5
  if (count == sum) {
    listOfBlogs
  } else {
    val random = new Random()
    val keysWithIndexes = bloglist.keys.toList.zipWithIndex
   val keyWithIndex = for(tupleWithKey <- keysWithIndexes if tupleWithKey._2 == random.nextInt(keysWithIndexes.length)) yield tupleWithKey
    keyWithIndex match {
      case (key, _) :: Nil =>

        val numberOfBlogs = listOfBlogs.get(key).fold(sum)(identity)
        val updatedBlog = listOfBlogs + (key -> (numberOfBlogs + 1))
        writeBlogHelper(updatedBlog, count + 1)
    }




  }
}

writeBlogHelper(bloglist, 0)
