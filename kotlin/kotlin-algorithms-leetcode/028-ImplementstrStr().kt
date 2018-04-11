// This solution was ranked top among all Kotlin submissions (2018 Feb 20)

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var result = -1
        val lenHaystack = haystack.length
        val lenNeedle = needle.length        
        if(lenNeedle == 0) { return 0 }        
        
        for(i in 0 .. lenHaystack-lenNeedle) {
            var found = true
            for(j in 0 .. lenNeedle-1) {
                if(haystack[i+j] != needle[j]) {
                    found = false
                    break
                }
            }
            if(found) { return i }
        }
        
        return result
    }
}
