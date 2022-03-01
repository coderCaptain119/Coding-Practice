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

static Node addOne(Node head){
// return the head of the modified linked list
        Node temp = head;
        int carry = 1;
        int sum = 0;
        while(carry != 0 && temp.next != null){
        sum = temp.data + carry;
        temp.data = sum % 10;
        carry = sum / 10;
        temp = temp.next;
        }

        sum = temp.data + carry;
        temp.data = sum % 10;
        carry = sum / 10;

        while(carry != 0){
        Node newNode = new Node(carry%10);
        temp.next = newNode;
        temp = newNode;
        carry = carry/10;
        }
        return head;
        }