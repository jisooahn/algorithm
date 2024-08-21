class Solution {
    public int solution(String[] strArr) {
        int[] lenCount = new int[strArr.length + 1];
        for (String str : strArr) {
            lenCount[str.length()]++;
        }
        int answer = lenCount[0];
        for (int count : lenCount) {
            if (answer < count) {
                answer = count;
            }
        }
        return answer;
    }
}