import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int number : numbers) {
            queue.add(number);
        }
        for (int i = 1; i < k; i++) {
            queue.add(queue.poll());
            queue.add(queue.poll());
        }
        return queue.poll();
    }
}