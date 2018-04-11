// NOTE: This solution uses a brute-force algorithm.
// There are more room for improvement.

class Solution {
    fun maxArea(height: IntArray): Int {
        var maximum = 0
        for(i in 0 .. height.size-2) {
            for(j in 1 .. height.size-1) {
                maximum = maxOf(maximum, (j-i)*minOf(height[i], height[j]))
            }
        }
        return maximum
    }
}
