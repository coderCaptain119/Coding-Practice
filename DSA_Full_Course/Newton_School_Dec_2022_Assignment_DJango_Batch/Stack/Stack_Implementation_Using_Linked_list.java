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

Node top = null;
public void push(int x){
//enter your code here
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        }

public void pop(){
//enter your code here
        if(top == null){
        return;
        }
        top = top.next;
        }

public void top(){
//enter your code here
        if(top == null){
        System.out.println(0);
        return;
        }
        System.out.println(top.val);
        }