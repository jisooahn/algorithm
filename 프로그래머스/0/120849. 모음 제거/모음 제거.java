class Solution {
    public String solution(String my_string) {
        String[] aeiou = {"a", "e", "i", "o", "u"};
        for (String a : aeiou) {
            my_string = my_string.replace(a, "");
        }
        return my_string;
    }
}