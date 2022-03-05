package dsa.DataStructure;

public class Stack_Using_Linked_List {
    // This class shows how to Implement
    // Stack using Linked List

    Node top;
    int size;

    class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
        }
    }
    // push() method for insert data into Stack
    public void push(int value){
        Node newTop = new Node(value);
        newTop.next = top;
        top = newTop;
        ++size;
    }
    // pop() method for delete data from Stack
    public void pop(){
        if(top == null){
            System.out.println("StackUnderFlow");
            return;
        }
        top = top.next;
        --size;
    }
    // peek() method for get data from Stack
    public int peek(){
        if(top == null){
            System.out.println("EmptyStack");
            return -1;
        }
        return this.top.data;
    }
    // size() method for get size of current stack
    public int size(){
        return this.size;
    }

}
