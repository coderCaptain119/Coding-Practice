/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
public static Node deleteElement(Node head,int k) {
//enter your code here
        Node slow = head;
        Node fast = head;
        for(int i=1; i<k; i++){
        fast = fast.next;
        }
        while(fast.next != null){
        slow = slow.next;
        fast = fast.next;
        }

        if(slow == head){
        head = head.next;
        head.prev = null;
        return head;
        }

        if(slow != fast){
        slow.next.prev = slow.prev;
        }
        slow.prev.next = slow.next;
        return head;

        }