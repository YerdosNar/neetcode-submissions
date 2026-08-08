class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        int a, b;
        for (String i:tokens) {
            switch(i) {
                case "+":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(a+b);
                    break;
                case "-":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(b-a);
                    break;
                case "*":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(a*b);
                    break;
                case "/":
                    a = nums.pop();
                    b = nums.pop();
                    nums.push(b/a);
                    break;
                default:
                    nums.push(Integer.parseInt(i));
                    break;
            }
        }
        return nums.pop();
    }
}
