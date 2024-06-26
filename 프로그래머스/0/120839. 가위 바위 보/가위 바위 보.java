import java.util.*;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = Map.of(
            '0', '5',
            '2', '0',
            '5', '2'
        );
        for (char c : rsp.toCharArray()) {
            sb.append(map.get(c));
        }
        return sb.toString();
    }
}