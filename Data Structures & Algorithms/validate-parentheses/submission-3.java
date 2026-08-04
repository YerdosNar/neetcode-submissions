class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if ((stack.isEmpty()) && 
                (c == ']' || c == '}' || c == ')')) 
            {
                return false;
            }
            if (c == ']' && stack.peek() == '[' ||
                c == '}' && stack.peek() == '{' ||
                c == ')' && stack.peek() == '(')
            {
                stack.pop();
            }
            else {
                stack.push(c);
            }
            // else if (c == '(' || c == '[' || c == '{') {
            //     stack.push(c);
            // }
        }
        return stack.isEmpty();
    }
}
