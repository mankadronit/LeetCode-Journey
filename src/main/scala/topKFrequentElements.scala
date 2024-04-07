object Solution extends App {
  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    import scala.collection.mutable

    // Count the frequency of each number
    val frequencyMap = mutable.Map[Int, Int]().withDefaultValue(0)
    nums.foreach(num => frequencyMap(num) += 1)

    // Convert the frequency map to a sequence and sort it by frequency in descending order
    val sortedByFrequency = frequencyMap.toSeq.sortBy(-_._2)

    // Take the first k elements from the sorted sequence and map them to get the numbers
    sortedByFrequency.take(k).map(_._1).toArray
  }
}
