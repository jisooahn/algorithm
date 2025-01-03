class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int index = 0;
        int[] st = new int[ingredient.length];
        for (int i : ingredient) {
            st[index++] = i;
            if (index >= 4 && st[index - 4] == 1
               && st[index - 3] == 2
               && st[index - 2] == 3
               && st[index - 1] == 1) {
                answer++;
                index -= 4;
            }
        }
        return answer;
    }
}