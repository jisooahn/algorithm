import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        Deque<Integer> deque = new LinkedList<>();
        for (int number : numbers) {
            deque.add(number);
        }
        if ("right".equals(direction)) {
            deque.addFirst(deque.pollLast());
        } else {
            deque.addLast(deque.pollFirst());
        }
        int idx = 0;
        while (!deque.isEmpty()) {
            answer[idx++] = deque.pollFirst();
        }
        return answer;
    }
}