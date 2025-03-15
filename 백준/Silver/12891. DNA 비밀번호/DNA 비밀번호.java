import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] checkArr;
    static int[] myArr;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] password = st.nextToken().toCharArray();

        st = new StringTokenizer(br.readLine());
        checkArr = new int[4];
        myArr = new int[4];
        count = 0;
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                count++;
            }
        }

        int result = 0;
        for (int i = 0; i < p; i++) {
            add(password[i]);
        }
        if (count == 4) {
            result++;
        }

        for (int i = p; i < s; i++) {
            int j = i - p;
            add(password[i]);
            remove(password[j]);
            if (count == 4) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    count++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    count++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    count++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    count++;
                }
                break;
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    count--;
                }
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    count--;
                }
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    count--;
                }
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    count--;
                }
                myArr[3]--;
                break;
        }
    }
}