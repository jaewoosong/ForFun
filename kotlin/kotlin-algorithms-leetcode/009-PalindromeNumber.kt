/** TODO:
  * The problem says one should not use extra space.
  * So the code below is a temporary one, using extra space for strings.
  */

class Solution {
    fun isPalindrome(x: Int): Boolean {
		var strX = x.toString()		
		while(strX.length > 1) {
			if(strX[0] != strX[strX.length-1]) {
				return false
			} else {
				strX = strX.slice(IntRange(1, strX.length-2))
			}				
		}
		return true
    }
}
