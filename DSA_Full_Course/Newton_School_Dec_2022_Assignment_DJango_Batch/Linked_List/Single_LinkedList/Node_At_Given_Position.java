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

public static Node addElement(Node head, int k ,int pos ) {
//enter your code here
        Node newNode = new Node(k);
        if(pos == 1){
        newNode.next = head;
        return newNode;
        }
        Node temp = head;
        for(int i=1; i<pos-1; i++){
        temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
        }