class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for (String s:operations) {
            if (s.equals("+")) {
                int first  = record.pop();
                int second = record.pop();
                record.push(second);
                record.push(first);
                record.push(first+second);
            }
            else if (s.equals("D")) {
                int num = record.peek();
                record.push(num * 2);
            }
            else if (s.equals("C")) {
                record.pop();
            }
            else {
                record.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while (!record.isEmpty()) {
            sum += record.pop();
        }
        return sum;
    }
}