class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            int sChar = s.charAt(i);
            int tChar = t.charAt(i);
            count[sChar - 'a']++;
            count[tChar - 'a']--;
        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
}
