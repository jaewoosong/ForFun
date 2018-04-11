/**
 * TODO:
 *   The problem requires O(log(m+n)) time complexity.
 *   This code is a temporary version which runs with O(m+n).
 */
 
class Solution {
	fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
		val len1 = nums1.size
		val len2 = nums2.size
		val totalLen = len1 + len2
		
		var nums = IntArray(totalLen)
		var idx1 = 0
		var idx2 = 0
		
		while(idx1<len1 && idx2<len2) {
			if(nums1[idx1] <= nums2[idx2]) {
				nums[idx1+idx2] = nums1[idx1]
				idx1 += 1
			} else {
				nums[idx1+idx2] = nums2[idx2]
				idx2 += 1
			}
		}
		
    	while(idx1<len1) {
			nums[idx1+idx2] = nums1[idx1]
			idx1 += 1
		}
		
		while(idx2<len2) {
			nums[idx1+idx2] = nums2[idx2]
			idx2 += 1
		}
		
		if(totalLen%2 == 0) {
			return (nums[totalLen/2-1] + nums[totalLen/2])/2.0
		} else{
			return nums[totalLen/2] / 1.0
		}		
	}
}
