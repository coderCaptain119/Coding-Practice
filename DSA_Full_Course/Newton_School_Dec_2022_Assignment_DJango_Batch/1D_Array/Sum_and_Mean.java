static void SumAndMean(int arr[],int N){
        int sum=0,mean=0,i=0;
        for(i=0;i<N;i++)
        sum += arr[i];
        mean = sum/N;
        System.out.println(sum+" "+mean);
        //Enter your code here
}