class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        
        int maxLen = 0;
        Set<Character> hs = new HashSet<>();
        for(char c : s.toCharArray()){
            hs.add(c);
        }
        for(char c : hs){
            int l = 0,len = 0;
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == c){
                    len++;
                }

                while((i-l+1) - len > k){
                    if(s.charAt(l) == c){
                        len--;
                    }
                    l++;
                }
                maxLen = Math.max(i-l+1,maxLen);
            }
        }

        return maxLen;
    }
}
