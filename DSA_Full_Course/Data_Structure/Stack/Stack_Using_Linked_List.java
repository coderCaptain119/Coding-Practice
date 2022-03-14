package Data_Structure.Stack;

import Data_Structure.List.LinkedList;

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
    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        return false;
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
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return;
        }
        top = top.next;
        --size;
    }
    // peek() method for get data from Stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return this.top.data;
    }
    // size() method for get size of current stack
    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            String s = "Stack is Empty";
            return s;
        }
        StringBuffer s = new StringBuffer();
        Node temp = top;
        s.append("[ ");
        while(temp != null){
            s.append(temp.data + " ");
            temp = temp.next;
        }
        s.append("]");
        return s.toString();
    }
}
