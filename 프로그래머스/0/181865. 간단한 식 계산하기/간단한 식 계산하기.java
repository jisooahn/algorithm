class Solution {
    public int solution(String binomial) {
        String[] split = binomial.split(" ");
        int a = Integer.valueOf(split[0]);
        int b = Integer.valueOf(split[2]);
        int answer = switch (split[1]) {
            case "+" -> answer = a + b;
            case "-" -> answer = a - b;
            case "*" -> answer = a * b;
            default -> throw new IllegalArgumentException("Invalid Operator");
        };
        return answer;
    }
}