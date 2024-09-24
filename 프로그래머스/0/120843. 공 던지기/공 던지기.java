import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int number : numbers) {
            queue.add(number);
        }
        int count = 1;
        while (count < k) {
            queue.add(queue.poll());
            queue.add(queue.poll());
            count++;
        }
        return queue.poll();
    }
}