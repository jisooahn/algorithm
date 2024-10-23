class Solution {
    public String solution(String polynomial) {
        int coefficient = 0;
        int sum = 0;
        for (String str : polynomial.split(" ")) {
            if (str.equals("+")) {
                continue;
            }
            if (str.contains("x")) {
                coefficient += str.equals("x") ? 1 : Integer.parseInt(str.replace("x", ""));
            } else {
                sum += Integer.parseInt(str);
            }
        }

        if (coefficient == 0) {
            return Integer.toString(sum);
        } 
        if (sum == 0) {
            return coefficient == 1 ? "x" : coefficient + "x";
        }
        return (coefficient == 1 ? "x" : coefficient + "x") + " + " + sum;
    }
}