class Solution {
    class TempIdx {
        int temp;
        int index;
        TempIdx(int temp, int idx) {
            this.temp = temp;
            this.index = idx;
        }
    }
    
    public int[] dailyTemperatures(int[] temps) {
        int len = temps.length;
        int res[] = new int[len];
        Stack<TempIdx> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            int temp = temps[i];
            while (!stack.isEmpty() && temp > stack.peek().temp) {
                TempIdx ti = stack.pop();
                res[ti.index] = i - ti.index;
            }
            stack.push(new TempIdx(temp, i));
        }
        return res;
    }
}
