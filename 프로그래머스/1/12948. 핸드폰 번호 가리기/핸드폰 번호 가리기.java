class Solution {
    public String solution(String phone_number) {
        char[] chArr = phone_number.toCharArray();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            chArr[i] = '*';
        }
        return new String(chArr);
    }
}