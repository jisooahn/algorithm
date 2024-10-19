import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                sb.append(key);
            }
        }
        return sb.toString();
    }
}