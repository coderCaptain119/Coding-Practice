static Queue<Integer> ReverseK(Queue<Integer> queue, int k) {
        //enter your code here
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<k;i++){
        stack.push(queue.peek());
        queue.remove();
        }

        while(!stack.isEmpty()){
        queue.add(stack.pop());
        }

        for(int i =0;i< queue.size() -k;i++){
        queue.add(queue.peek());
        queue.remove();
        }
        return queue;
        }