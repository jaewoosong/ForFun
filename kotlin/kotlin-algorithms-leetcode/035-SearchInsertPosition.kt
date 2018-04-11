class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if(nums == null) { return 0 }
        for(i in 0 .. nums.size-1) {
            if(nums[i] >= target) { return i }
        }
        return nums.size
    }
}
