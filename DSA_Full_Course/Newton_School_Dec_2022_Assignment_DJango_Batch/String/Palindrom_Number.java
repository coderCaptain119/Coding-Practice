static boolean isPalindrome(int N)
        {
        // your code here
        int temp = N;
        int result = 0;
        while(temp != 0){
        result = result*10 + temp%10;
        temp = temp/10;
        }
        if(result == N)
        return true;
        return false;
        }