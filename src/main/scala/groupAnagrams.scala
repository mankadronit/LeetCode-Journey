object Solution extends App {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    import scala.collection.mutable.{HashMap, ListBuffer}

    val hmap: HashMap[String, ListBuffer[String]] = HashMap()

    strs.foreach { word =>
      val sortedWord = word.sorted
      hmap.getOrElseUpdate(sortedWord, ListBuffer()) += word
    }

    hmap.values.map(_.toList).toList
  }
}
