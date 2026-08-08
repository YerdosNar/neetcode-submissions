class Node {
    int val;
    Node next;
    Node (int val, Node next) {
        this.val = val;
        this.next = next;
    }
    Node (int val) {
        this(val, null);
    }
}

class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = new Node(0, null);
        size = 0;
    }

    private Node getNode(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    
    public int get(int index) {
        if (index >= size || index < 0) return -1;
        return getNode(index).next.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;

        Node prev = getNode(index);
        Node newN = new Node(val, prev.next);
        prev.next = newN;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size) return;

        Node node = getNode(index);
        node.next = node.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */