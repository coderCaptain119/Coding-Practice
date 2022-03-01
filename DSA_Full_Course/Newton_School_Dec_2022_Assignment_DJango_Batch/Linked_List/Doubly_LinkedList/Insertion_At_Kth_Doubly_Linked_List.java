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


public static Node insertnew(Node head,int K, int P) {
        Node newNode = new Node(K);
        Node temp = head;
        if(P == 1){
        newNode.next = head;
        head.prev = newNode;
        return newNode;
        }
        for(int i=1; i<P-1; i++){
        temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.next.prev = newNode;

        return head;
        }