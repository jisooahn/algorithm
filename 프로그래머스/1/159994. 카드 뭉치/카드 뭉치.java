import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queCards1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queCards2 = new LinkedList<>(Arrays.asList(cards2));

        for (String word : goal) {
            if (!queCards1.isEmpty() && queCards1.peek().equals(word)) {
                queCards1.poll();
            } else if (!queCards2.isEmpty() && queCards2.peek().equals(word)) {
                queCards2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}