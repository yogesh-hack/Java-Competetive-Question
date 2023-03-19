// Problem  : 12

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
  
// Input: num = 1994
// Output: "MCMXCIV"
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class Solution {
    public String intToRoman(int num) {
        //                   1    2    3    4    5   6     7     8     9
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        //                   10  20    30   40   50  60    70     80   90
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        //                   100 200  300  400  500  600  700   800   900
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        //              1000 2000 3000
        String ths[]={"","M","MM","MMM"};
        
        //  given constraits is 1 <= num <= 3999
        
        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }
}

// Beginer frienf=dly solution

class Solution {
    public String intToRoman(int num) {
        String Roman = "";
        int[][] storeIntRoman = {{1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}};
        for (int i = 0; i < storeIntRoman.length; i++) {
            while (num >= storeIntRoman[i][0]) {
                Roman += storeIntRoman[i][1];
                num -= storeIntRoman[i][0];
            }
        }
        return Roman;
    }
}
