#include<iostream>
using namespace std;

 bool checkpalin(string str, int i, int j){
    //! Base Case
    if(i > j){
        return true;
    }
    if(str[i] != str[j]){
        return false;
    }
    //! recursive call
    return checkpalin(str, i++, j--);
 }

int main(){
    string str;
    cin >> str;
    // check karna h ki string palindrome h ya nahi
    //? reverse karna padega
    //* original string ko change nahi karna
    bool ispalindrome = checkpalin(str,0 , str.lenght()-1);

    if(ispalindrome == true){
        cout << " Stroing is palindrome" << endl;
    }
    else{
        cout<< " String is not palindrome" << endl;
    }
    return 0;
}