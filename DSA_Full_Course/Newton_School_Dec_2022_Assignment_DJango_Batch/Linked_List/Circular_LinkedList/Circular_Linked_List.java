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

public static int check(Node head) {
//enter your code here
        Node temp = head;
        while(temp != null && temp.next != head){
        temp = temp.next;
        }
        if(temp == null){
        return 0;
        }
        return 1;
        }