/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static Node exchangeNodes(Node head) {
//Enter your code here
        if(head.next.next == head){
        head = head.next;
        return head;
        }
        Node temp = head;
        while(temp.next.next != head){
        temp = temp.next;
        }

        temp.next.next = head.next;
        head.next = temp.next;
        temp.next = head;
        head = head.next;

        return head;
        }