import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap<>();
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)) {
                    count = -1;
                    break;
                }
                count += map.get(c);
            }
            answer[i] = count;
        }
        return answer;
    }
}