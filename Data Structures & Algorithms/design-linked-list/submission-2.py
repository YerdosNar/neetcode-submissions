class Node:
    def __init__(self, val: int):
        self.val = val
        self.next = None


class MyLinkedList:
    def __init__(self):
        self.head = Node(0)
        self.size = 0


    def get(self, index: int) -> int:
        if index >= self.size or index < 0:
            return -1
        cur = self.head.next
        for i in range(index):
            cur = cur.next
        return cur.val
        

    def addAtHead(self, val: int) -> None:
        node = Node(val)
        node.next = self.head.next
        self.head.next = node
        self.size += 1
        

    def addAtTail(self, val: int) -> None:
        node = Node(val)
        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = node
        self.size += 1
        

    def addAtIndex(self, index: int, val: int) -> None:
        if index > self.size or index < 0:
            return -1
        cur = self.head
        for i in range(index):
            cur = cur.next
        node = Node(val)
        node.next = cur.next
        cur.next = node
        self.size += 1
        

    def deleteAtIndex(self, index: int) -> None:
        if index >= self.size or index < 0:
            return

        cur = self.head
        for i in range(index):
            cur = cur.next
        cur.next = cur.next.next
        self.size -= 1
        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)