class Solution {
    public String solution(String my_string, int[] indices) {
        String[] split = my_string.split("");
        for (int indicy : indices) {
            split[indicy] = "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}