public static int[] implementMergeSort(int[] arr, int start, int end)
        {
        // Your code here
        if(start<end){
        int mid = start + (end-start)/2;
        arr = implementMergeSort(arr,start,mid);
        arr = implementMergeSort(arr,mid+1,end);
        arr = merge(arr,start,mid,end);
        }

        return arr;
        // You can have your own function where you will use
        // start and end position for divide purpose
        }
public static int[] merge(int[] arr, int start, int mid, int end){

        int n1 = mid-start+1;
        int n2 = end-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0; i<n1; i++){
        leftArr[i] = arr[start+i];
        }
        for(int i=0; i<n2; i++){
        rightArr[i] = arr[mid+1+i];
        }

        int i = 0, j =0;
        int k = start;
        while(i<n1 && j<n2){
        if(leftArr[i] < rightArr[j]){
        arr[k] = leftArr[i];
        i++;
        k++;
        }
        else{
        arr[k] = rightArr[j];
        j++;
        k++;
        }
        }
        while(i<n1){
        arr[k] = leftArr[i];
        i++;
        k++;
        }
        while(j<n2){
        arr[k] = rightArr[j];
        j++;
        k++;
        }
        return arr;

        }