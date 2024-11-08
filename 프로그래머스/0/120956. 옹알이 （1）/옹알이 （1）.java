import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> set = new HashSet<>(List.of("aya", "ye", "woo", "ma"));
        for (String b : babbling) {
            StringBuilder sb = new StringBuilder();
            for (char c : b.toCharArray()) {
                sb.append(c);
                if (set.contains(sb.toString())) {
                    sb.setLength(0);
                }
            }
            if (sb.length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}