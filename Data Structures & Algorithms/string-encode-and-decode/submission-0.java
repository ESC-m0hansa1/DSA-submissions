class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            String temp = Integer.toString(str.length());
            sb.append(temp + "#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int sharpIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, sharpIndex));
            i = sharpIndex + 1;
            String s = str.substring(i, i + length);
            res.add(s);
            i += length;
        }
        return res;
    }
}