class Solution {
    public int solution(int chicken) {
        int totalServiceChicken = 0;
        int coupons = chicken;
        while (coupons >= 10) {
            int serviceChicken = coupons / 10;
            totalServiceChicken += serviceChicken;
            coupons = serviceChicken + (coupons % 10);
        }
        return totalServiceChicken;
    }
}