import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while (true) {
            int[] tmp = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] >= 50 && tmp[i] % 2 == 0) {
                    tmp[i] /= 2;
                } else if (tmp[i] < 50 && tmp[i] % 2 != 0) {
                    tmp[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, tmp)) {
                return count;
            }
            arr = tmp;
            count++;
        }
    }
}