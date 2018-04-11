class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort()
        val resultList = mutableListOf<List<Int>>()
        for(i in 0 .. nums.size-4) {
            val first = nums[i]
            for(j in i+1 .. nums.size-3) {
                val second = nums[j]
                for(k in j+1 .. nums.size-2) {
                    val third = nums[k]
                    for(l in k+1 .. nums.size-1) {
                        val fourth = nums[l]
                        val sum = first + second + third + fourth
                        if(sum == target) {
                            var oneResult: MutableList<Int> = mutableListOf(first, second, third, fourth)
                            if(!resultList.contains(oneResult)) {
                                resultList.add(oneResult)
                            }
                            break
                        }
                        else if(sum > target) { break }
                    }
                }
            }
        }
        return resultList
    }
}
