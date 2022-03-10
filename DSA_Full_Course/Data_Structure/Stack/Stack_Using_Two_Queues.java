package Data_Structure.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Two_Queues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;

    Stack_Using_Two_Queues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }
    public void push(int data){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(data);
        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
        size++;
    }
    public void pop(){
        q1.remove();
        size--;
    }
    public int peek(){
        return q1.peek();
    }
}
