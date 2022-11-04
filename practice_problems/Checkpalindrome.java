class Checkpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome or not : ")
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if(rev == original){
            System.out.println("This number is palindrome number.")
        }
        else{
            System.out.println("This number is not plaindrome number.")
        }
    }
}