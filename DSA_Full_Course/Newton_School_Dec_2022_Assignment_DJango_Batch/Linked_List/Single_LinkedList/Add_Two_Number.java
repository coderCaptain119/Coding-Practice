/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/
static Node addNumber(Node first, Node second){
// return the head of the modified linked list
        addPreZero(first, second);
        Node p1 = first;
        Node p2 = second;
        int sum = 0, carry = 0;
        while(p1.next != null && p2.next != null){
        sum = p1.data + p2.data + carry;
        p1.data = sum%10;
        carry = sum/10;
        p1 = p1.next;
        p2 = p2.next;
        }
        sum = p1.data + p2.data + carry;
        p1.data = sum%10;
        carry = sum/10;

        while(carry != 0){
        Node newNode = new Node(carry%10);
        p1.next = newNode;
        p1 = newNode;
        carry /= 10;
        }
        return first;
        }
static void addPreZero(Node first, Node second){
        Node p1 = first;
        Node p2 = second;
        while(p1.next != null && p2.next != null){
        p1 = p1.next;
        p2 = p2.next;
        }
        if(p1.next == null){
        while(p2.next != null){
        Node newNode = new Node(0);
        p1.next = newNode;
        p1 = p1.next;
        p2 = p2.next;
        }
        }
        else{
        while(p1.next != null){
        Node newNode = new Node(0);
        p2.next = newNode;
        p1 = p1.next;
        p2 = p2.next;
        }
        }
        }