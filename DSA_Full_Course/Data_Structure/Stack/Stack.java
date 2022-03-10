package Data_Structure.Stack;

public class Stack {
    Node top;
    int size;

    class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
        }
    }
    //Constructor for create stack with given value
    Stack(int a){
        push(a);
    }
    // Parameterizes Constructor for
    // create stack with value of given array
    Stack(int[] arr){
        for(int a : arr){
            push(a);
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
        if(isEmpty()){
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
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    // size() method for get size of current stack
    public int size(){
        return this.size;
    }
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append("]");
        while(!isEmpty()){
            s.append(peek());
            s.append(" ,");
            pop();
        }
        s.deleteCharAt(s.length()-1);
        s.deleteCharAt(s.length()-1);
        s.append("[");

        return s.reverse().toString();

    }
}
