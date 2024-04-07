object Solution extends App {
    def isAnagram(s: String, t: String): Boolean = {
        import scala.collection.mutable.HashMap

        val set: HashMap[String, Int] = HashMap[String, Int]()

        s.foreach(c => {
          if (set.contains(c.toString)) {
            set(c.toString) += 1
          } else {
            set.addOne((c.toString, 1))
          }
        })

        var isAnagram: Boolean = true

        t.foreach(c => {
          if (!set.contains(c.toString)) {
            isAnagram = false
          } else {
            set(c.toString) -= 1
          }})

        for ((k,v) <- set) {
          if(v != 0) isAnagram = false
        }
        isAnagram
    }
}
