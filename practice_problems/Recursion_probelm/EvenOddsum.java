import java.util.ArrayList; // import the ArrayList class
class Evenodd {
  static int count = 0;
  static int even =0;
  static int odd =0;
  public static ArrayList<Integer> Digits(int num) {
    if (num > 0) {
      count++;
      if(count%2 == 0){
          even += num%10;
      }
      else{
          odd += num%10;
      }
      Digits(num / 10);
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(even);
    list.add(odd);
    return list;
  }
  public static void main(String[] args) {
    int num = 31593;
    System.out.println("[Even , Odd ] : " + Digits(num));
  }
}

// +++++++++++++++++++++++++++++  OUTPUT ++++++++++++++++++++++++++++++
// [Even , Odd ] : [10, 11]
