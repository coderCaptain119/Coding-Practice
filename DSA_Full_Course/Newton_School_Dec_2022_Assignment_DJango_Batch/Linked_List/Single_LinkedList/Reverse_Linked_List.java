/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
        // return the head of the modified linked list
        if(head.next == null){
        return head;
        }
        Node tempHead = null;
        Node temp = head.next;

        while(temp != null){
        head.next = tempHead;
        tempHead = head;
        head = temp;
        temp = temp.next;
        }

        head.next = tempHead;

        return head;
        }