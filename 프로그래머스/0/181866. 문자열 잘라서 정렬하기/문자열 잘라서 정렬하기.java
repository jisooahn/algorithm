import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        for (String split : myString.split("x")) {
            if (!split.isEmpty()) {
                list.add(split);
            }
        }
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}