class MinStack {
    class ValMin {
        int val, min;
        ValMin(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
    private Stack<ValMin> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int min = val;
        if (stack.isEmpty()) {
            stack.push(new ValMin(val, val));
            return;
        }

        if (stack.peek().min < min) {
            min = stack.peek().min;
        }
        stack.push(new ValMin(val, min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
