class Checkarmstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check armstrong or not : ")
        int n = sc.nextInt();
        int digit = 0;
        int original = n;
        while(n!=0){
            digit+=Math.pow(n%10,3);
            n/=10;
        }
        if(digit == original){
            System.out.println("This number is armstrong number.")
        }
        else{
            System.out.println("This number is not arnstrong number.")
        }
    }
}