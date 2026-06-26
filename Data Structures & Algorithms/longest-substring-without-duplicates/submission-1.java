class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Map<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int maxLen = 1;
        hm.put(s.charAt(0),0);
        
        
        for(int i = 1 ; i < s.length() ; i++){
           if(hm.containsKey(s.charAt(i))){
            
            maxLen = Math.max(maxLen,i-left);
            left = Math.max(left,hm.get(s.charAt(i))+1) ;
           }
           hm.put(s.charAt(i),i);

        }
        
        return Math.max(maxLen,s.length()-left);
    }
}
