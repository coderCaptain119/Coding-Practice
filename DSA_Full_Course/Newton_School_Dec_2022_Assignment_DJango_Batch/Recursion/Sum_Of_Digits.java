static long  Sum(long  n)
        {
        //Enter your code here
        if(n == 0){
        return 0;
        }
        return n%10 + Sum(n/10);
        }