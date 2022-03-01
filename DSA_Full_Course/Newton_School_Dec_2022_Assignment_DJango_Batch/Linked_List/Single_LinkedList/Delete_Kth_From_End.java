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

public static Node deleteElement(Node head,int k) {
//enter your code here
        if(head.next == null){
        return null;
        }
        Node slow = head;
        Node fast = head;
        int count = 1;
        while(count <= k){
        fast = fast.next;
        count++;
        }
        if(fast == null){
        return head.next;
        }
        while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;

        }