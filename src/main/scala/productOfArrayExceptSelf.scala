object Solution extends App {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val n = nums.length
        val result = Array.fill(n)(1)

        var prefixProduct = 1
        for (i <- 0 until n) {
            result(i) *= prefixProduct
            prefixProduct *= nums(i)
        }

        var suffixProduct = 1
        for (i <- n - 1 to 0 by -1) {
            result(i) *= suffixProduct
            suffixProduct *= nums(i)
        }

        result
    }
}

