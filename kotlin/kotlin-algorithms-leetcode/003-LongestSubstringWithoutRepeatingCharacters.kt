class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var best: String = ""
        var curr: String = ""
        for(c in s) {
            if(c in curr) {
                if(curr.length > best.length) {
                    best = curr                    
                }                
                if(curr.indexOf(c)+1 < curr.length) {
                    curr = curr.substring(curr.indexOf(c)+1) + c
                } else {
                    curr = "" + c
                }                
            } else {
                curr += c
                if(curr.length > best.length) {
                    best = curr                    
                }
            }
        }
        return best.length  
    }
}
