import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            int count = map.get(player) - 1;
            if (count == 0) {
                map.remove(player);
            } else {
                map.put(player, count);
            }
        }
        return map.keySet().iterator().next();
    }
}