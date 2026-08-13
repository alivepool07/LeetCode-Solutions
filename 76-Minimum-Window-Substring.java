class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int left = 0, right = 0, matched = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while(right < s.length()) {
            char rightChar = s.charAt(right);

            if(map.containsKey(rightChar)) {
                map.put(rightChar , map.get(rightChar) - 1);

                if(map.get(rightChar) >= 0) {
                    matched++;
                }
            }

            while(matched == t.length()) {

                int currWinLen = right -left +1;
                if(currWinLen < minLen) {
                    minLen = currWinLen;
                    startIndex = left;

                }
                char leftChar = s.charAt(left);

                if(map.containsKey(leftChar)) {
                    if(map.get(leftChar) ==0) {
                        matched--;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex , startIndex + minLen);
    }
}