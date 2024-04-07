import scala.collection.mutable.HashSet

object Solution extends App {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.sortInPlace
    var hasDuplicate = false
    var i = 1
    while (i < nums.length && !hasDuplicate) {
        if(nums(i) == nums(i-1)) {
            hasDuplicate = true
        } else {
            i += 1
        }
    }

    hasDuplicate
  }
}

