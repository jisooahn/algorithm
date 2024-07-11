class Solution {
    public String solution(String my_string, int[] indices) {
        boolean[] isDeleted = new boolean[my_string.length()];
        for (int indicy : indices) {
            isDeleted[indicy] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!isDeleted[i]) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}