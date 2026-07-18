class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        Map<Integer,List<Integer>> bucket = new HashMap<>();
        List<Integer> unqs = new ArrayList<>(freq.keySet());
        for(int unq : unqs){
            int temp = freq.get(unq);
            bucket.put(temp,new ArrayList<>());
        }
        for(int unq : unqs){
            bucket.get(freq.get(unq)).add(unq);
        }
        int[] res = new int[k];
        List<Integer> reversed = new ArrayList<>(bucket.keySet());
        Collections.sort(reversed);
        Collections.reverse(reversed);
        int idx = 0;
        for(int f : reversed){
            for(int num : bucket.get(f)){
                res[idx++] = num;
                if(idx == k)    return res;
            }
        }
        return res;

    }
}
