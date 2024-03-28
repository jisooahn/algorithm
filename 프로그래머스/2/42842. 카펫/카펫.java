class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int width = yellow / i + 2;
                int height = i + 2;
                if (width * height == carpet) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}