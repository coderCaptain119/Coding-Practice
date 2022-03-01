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
public static boolean IsPalindrome(Node head) {
//enter your code here
        Node head2 = reverseLinkedList(head);
        while(head != null && head2 != null){
        // System.out.println(head.val +" "+head2.val);
        if(head.val != head2.val){
        return false;
        }
        head = head.next;
        head2 = head2.next;
        }
        return true;
        }
public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        }
        return prev;
        }