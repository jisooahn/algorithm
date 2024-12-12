import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strings[i].charAt(n)).append(strings[i]);
            list.add(sb.toString());
        }
        
        Collections.sort(list);
        
        String[] answer = new String[strings.length];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}