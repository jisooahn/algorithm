class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    sb.append(Character.toString('a' + i));
                }
            }
        }
        return sb.toString();
    }
}