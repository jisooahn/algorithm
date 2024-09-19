import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, Character> map = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char) ('a' + i));
        }
        for (String s : letter.split(" ")) {
            sb.append(map.get(s));
        }
        return sb.toString();
    }
}