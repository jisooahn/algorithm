class Solution {
    public String solution(String phone_number) {
        String stars = "*".repeat(phone_number.length() - 4);
        String lastDigits = phone_number.substring(phone_number.length() - 4);
        return stars + lastDigits;
    }
}