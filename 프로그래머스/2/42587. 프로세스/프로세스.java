import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            queue.offer(priority);
        }

        int count = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    count++;
                    
                    if (location == i) {
                        return count;
                    }
                }
            }
        }
        return count;
    }
}