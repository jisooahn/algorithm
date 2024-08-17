import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] split = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" ");
        List<String> list = new ArrayList<>();
        for (String s : split) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        return list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);
    }
}