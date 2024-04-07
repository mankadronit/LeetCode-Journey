import scala.collection.mutable.{HashMap, ArrayBuffer}

object Solution extends App {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val hashMap = new HashMap[Int, Int]()
    val results: ArrayBuffer[Int] = ArrayBuffer[Int]()

    for ((element, index) <- nums.zipWithIndex) {
      val complement = target - element
      if (hashMap.contains(complement))
        results.addOne(index)
        results.addOne(hashMap(complement))
      else {
        hashMap.put(element, index)
      }
    }

    results.toArray
  }
}
