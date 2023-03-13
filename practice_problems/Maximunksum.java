class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,40,30,10,20,5};
        int n = arr.length;
        int k = 3;
        int sum = 0;
        int max = 0;
        for(int i=0;i < n;i++){
            for(int j=i;j<n-k+1;j++){
                sum += arr[j] + arr[j+1]+arr[j+2];
                if(sum > max){
                max = sum;
            }
            }
            
        }
        System.out.println(max);
    }
}

// Slidding window approach

class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,40,30,10,20,5};
        int n = arr.length;
        int k = 3;
        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        // slidding window approach
        
        for(int j=k;j<n;j++){
            // add next element and minus first element
            sum += arr[j] - arr[j-k];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
