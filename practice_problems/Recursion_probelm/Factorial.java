class Factorial{
  public static int fact(int num){
    // Base Condition
    if(num == 0 || num == 1){
      return 1;
    }
    return num * fact(num-1);
  }
  public static void main(String[] args){
    System.out.println("factorial is :" + fact(5));
  }
}