class Solution {
    public long solution(String numbers) {
        String[] strNumbers = {"zero", "one", "two", "three", "four",
                               "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strNumbers.length; i++) {
            numbers = numbers.replace(strNumbers[i], Integer.toString(i));
        }
        return Long.parseLong(numbers);
    }
}