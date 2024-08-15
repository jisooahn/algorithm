class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split(" ");
        int a = Integer.valueOf(split[0]);
        int b = Integer.valueOf(split[2]);
        switch (split[1]) {
            case "+" -> answer = a + b;
            case "-" -> answer = a - b;
            case "*" -> answer = a * b;
        }
        return answer;
    }
}