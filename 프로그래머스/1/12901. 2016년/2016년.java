class Solution {
    public static int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] daysOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public String solution(int a, int b) {
        int days = 0;
        for (int i = 1; i < a; i++) {
            days += daysInMonth[i];
        }
        days += b;
        return daysOfWeek[days % 7];
    }
}