class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for (int idx = i; idx <= j; idx++) {
            sb.append(idx);
        }
        String str = sb.toString();
        return str.length() - str.replace(Integer.toString(k), "").length();
    }
}