import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }

        int count = 0;

        while (!queue.isEmpty()) {
            boolean isHighestPriority = true;
            int[] currentProcess = queue.poll();
            for (int[] queuedProcess : queue) {
                if (currentProcess[0] < queuedProcess[0]) {
                    isHighestPriority = false;
                    queue.offer(currentProcess);
                    break;
                }
            }

            if (isHighestPriority) {
                count++;
                if (currentProcess[1] == location) {
                    break;
                }
            }
        }
        return count;
    }
}