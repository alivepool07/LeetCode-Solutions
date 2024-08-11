class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0;
		int index = 0;
		for(int i=0; i<haystack.length(); i++) {
			if(haystack.charAt(i) != needle.charAt(j)) {
				j= 0;
				i = index;
				index = i + 1;
			} else {
				j++;
			}
			if(j == needle.length()) {
				return index;
			}
		}
		return -1;
    }
}