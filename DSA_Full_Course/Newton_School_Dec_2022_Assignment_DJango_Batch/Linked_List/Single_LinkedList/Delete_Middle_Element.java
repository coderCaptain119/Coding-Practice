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

public static Node deleteMiddleElement(Node head) {
        // return the head of the modified Linked List
        if(head.next == null){
        head.val = -1;
        return head;
        }
        Node temp = head;
        int size = 1;
        while(temp.next != null){
        size++;
        temp = temp.next;
        }

        temp = head;
        for(int i=1; i<(size/2); i++){
        temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
        }