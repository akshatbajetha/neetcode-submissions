class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
