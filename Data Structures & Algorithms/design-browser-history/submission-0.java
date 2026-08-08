class Node {
    private String url;
    Node prev, next;
    Node (String url, Node prev, Node next) {
        this.url = url;
        this.prev = prev;
        this.next = next;
    }
    Node (String url) {
        this(url, null, null);
    }
}

class BrowserHistory {
    private Node head;
    private Node cur;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        cur = head;
    }
    
    public void visit(String url) {
        Node node = new Node(url, cur, null);
        cur.next = node;
        cur = cur.next;
    }
    
    public String back(int steps) {
        int i = 0;
        while (i < steps && cur.prev != null) {
            cur = cur.prev;
            i++;
        }
        return cur.url;
    }
    
    public String forward(int steps) {
        int i = 0;
        while (i < steps && cur.next != null) {
            cur = cur.next;
            i++;
        }
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */