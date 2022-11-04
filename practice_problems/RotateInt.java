import java.util.Scanner;

class RotateInt{
    ////Count the number of digits...
    public static int count(int n){
        int digit = 0;
        while(n!=0){
            n/=10;
            ++digit;
        }
        return digit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number to rotate : ");
        int n = sc.nextInt();
        System.out.println("Enter how many time to rotate that number : ");
        int k = sc.nextInt();
        int original= n;
        int original2 = n;
        //...
        if(k>count(original)){
            System.out.println("You enter rotation time is larger than digits of integer number.");
        }
        int times = k;
        if(k<count(original)){
            int x= count(original);
            // For Left Rotating....
            int left = original/(int)(Math.pow(10,x-k));
            original = original % (int)Math.pow(10,x-k);
            int l_d = count(left);
            original = original * (int) Math.pow(10,l_d) + left;
            System.out.println("After "+times+" left rotation number is : "+ original);

            // For Right rotating....
            
            int right = original2 / (int)Math.pow(10,k);
            original2 = original2 % (int)Math.pow(10,k);
            int r_d = count(right);
            original2 = original2 * (int)Math.pow(10,r_d) + right;
            System.out.println("\n After "+times+" right rotation number is : "+ original2);
            sc.close();
        }
        
    }
}


/*
output
Enter integer number to rotate : 12345
Enter how many time to rotate that number : 
2
After 2 left rotation number is : 34512
After 2 right rotation number is : 45123

*/