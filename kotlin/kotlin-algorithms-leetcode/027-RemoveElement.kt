class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var newLength = nums.size        
        for(num in nums) {
            if(num == `val`) { --newLength }
        }
        
        var length = nums.size
        for(j in 0 .. newLength) {
            for(i in 0 .. length-2) {
                if(nums[i] == `val`) {
                    nums[i] = nums[i+1]
                    nums[i+1] = `val`
                }
            }
        }
        return newLength
    }
}
