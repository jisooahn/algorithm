import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        
        Map<String, String> map = new HashMap<>();
        for (String[] dbIdPw : db) {
            map.put(dbIdPw[0], dbIdPw[1]);
        }
        
        if (map.containsKey(id)) {
            if (map.get(id).equals(pw)) {
                return "login";
            } else {
                return "wrong pw";
            }
        }
        return "fail";
    }
}