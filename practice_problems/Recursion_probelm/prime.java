class CheckPrimeNumber{
  // static int i = 2;
  public static boolean prime(int num, int i){
    //Base condition
    // condition 1 : if number is 2 i.e i -> return true
    // condition 2 : if number is divisible by 2 -> return false
    // condition 3 : if square of i is larger than number -> return true
    if(num < i){
      return false;
    }
    if(num == i){
      return true;
    }
    if(num % 2 == 0){
      return false;
    }
    if(i*i > num){
      return true;
    }
    return prime(num, i+1);
  }
  public static void main(String[] args){
    System.out.println(prime(7,2));
  }
}