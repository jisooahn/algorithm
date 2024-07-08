class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        char tmp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = tmp;
        return new String(charArray);
    }
}