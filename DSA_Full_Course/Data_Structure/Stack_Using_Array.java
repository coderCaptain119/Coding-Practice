package dsa.DataStructure;

public class Stack_Using_Array {
    // This class shows how to Implement
    // Stack using Array

    int top = -1;
    int[] arr = new int[100];
    int size;

    // push() method for insert data into Stack
    public void push(int value){
        if(size < 100) {
            arr[++top] = value;
            ++size;
        }
        else{
            System.out.println("StackOverFlow");
        }
    }
    // pop() method for delete data from Stack
    public void pop(){
        if(size > 0) {
            --top;
            --size;
        }
        else{
            System.out.println("StackUnderFlow");
        }
    }
    // peek() method for get data from Stack
    public int peek(){
        if(top < 0){
            System.out.println("EmptyStack");
            return -1;
        }
        return arr[top];
    }
    // size() method for get size of current stack
    public int size(){
        return this.size;
    }

}
