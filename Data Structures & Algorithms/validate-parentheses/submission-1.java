class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        char ch;
        int n = s.length();
        for(int i = 0 ; i < n ;i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '['|| ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                if(stack.pop() != map.get(ch))    return false;
            }

        }
        return stack.isEmpty();
    }
}
