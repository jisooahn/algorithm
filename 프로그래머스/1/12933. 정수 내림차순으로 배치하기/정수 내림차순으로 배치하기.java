import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] chars = Long.toString(n).toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(new String(chars));
        String str = sb.reverse().toString();
        return Long.parseLong(str);
    }
}