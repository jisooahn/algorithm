class Solution {
    public int solution(String[] strArr) {
        int[] lenCount = new int[strArr.length + 1];
        int answer = 0;
        for (String str : strArr) {
            lenCount[str.length()]++;
            answer = Math.max(answer, lenCount[str.length()]);
        }
        return answer;
    }
}