class Solution {
    public boolean isIsomorphic(String s, String t) {
       
       HashMap<Character , Character> map = new HashMap<>();
       int len = s.length();
       if(len != t.length()) return false;

       for(int i = 0 ; i < len ; i++){

        char original = s.charAt(i);
        char rep = t.charAt(i);

        if(! map.containsKey(original)){

            if(! map.containsValue(rep)) map.put(original, rep);
            else return false;
        }
        else {
            char charCheck = map.get(original);
            if(charCheck != rep) return false;
        }
       } 
       return true;

    }
}