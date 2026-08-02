class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int sum = 0;
        for (String s:operations) {
            if (s.equals("+")) {
                int first  = record.pop();
                int second = record.pop();
                record.push(second);
                record.push(first);
                record.push(first+second);
                sum += first + second;
            }
            else if (s.equals("D")) {
                int num = record.peek();
                record.push(num * 2);
                sum += (num * 2);
            }
            else if (s.equals("C")) {
                int num = record.pop();
                sum -= num;
            }
            else {
                int num = Integer.parseInt(s);
                record.push(num);
                sum += num;
            }
        }
        return sum;
    }
}