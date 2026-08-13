class Solution {
    private int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set <Integer> set = new HashSet<>();
        int num = n;
        while (true) {
            int s = sum(num);
            if (s == 1) return true;
            if (set.contains(s)) break;
            set.add(s);
            num = s;
        }
        
        return false;
    }
}
