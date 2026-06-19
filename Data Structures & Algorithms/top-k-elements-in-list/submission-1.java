class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> res = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            res.add(new int[]{entry.getValue(), entry.getKey()});
        }

        res.sort((a,b) -> b[0] - a[0]);

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = res.get(i)[1];
        }

        return ans;
    }
}
