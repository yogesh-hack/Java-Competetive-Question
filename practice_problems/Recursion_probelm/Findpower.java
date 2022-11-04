class Findpower{
    public static int power(int num, int exp){
        // base condition
        if (exp == 1){
            return num
        }
        // recursion 
        result = power(num, exp-1)
        return num * result
    }
    public static void main(String[] args){
        int num = 2;
        int exponent = 5;
        System.out.println("power is : "+power(num,exponent));
    }
}