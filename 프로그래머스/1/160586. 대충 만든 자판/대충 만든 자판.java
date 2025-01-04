class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                int minK = Integer.MAX_VALUE;
                
                for (String key : keymap) {
                    int k = key.indexOf(c);
                    if (k != -1) {
                        minK = Math.min(k, minK);
                    }
                }
                
                if (minK == Integer.MAX_VALUE) {
                    count = -1;
                    break;
                }
                count += minK + 1;
            }
            answer[i] = count;
        }
        return answer;
    }
}