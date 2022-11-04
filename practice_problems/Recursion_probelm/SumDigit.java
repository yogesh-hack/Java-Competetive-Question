class SumDigit{
  public static int sumdigit(int num){
    // base condition
    if(num == 0){
      return 0;
    }
    // sum(1234) + last_digit
    return sumdigit(num/10) + num%10;
  }
  public static void main(String[] args){
    int num = 12345;
    System.out.println(sumdigit(num));
  }
}
