static void printPattern(int n,int curr, boolean flag)
        {
//Enter your code here
        System.out.print(curr+" ");
        if(n == curr && !flag){
        return;
        }
        if(curr <= 0){
        flag = false;
        }
        if(flag){
        printPattern(n,curr-5,flag);
        }
        else{
        printPattern(n,curr+5,flag);
        }
        }