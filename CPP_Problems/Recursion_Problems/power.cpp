#include<iostream>
using namespaces std;

int power(int n){

    //Base case

    if(n == 0){
        return 1;
    }
    /*
    // int small_Problem = power(n-1);
    // int Big_Problem = 2 * small_Problem;
    // return Big_Problem;
    */

    return 2 * power(n-1);
}

int main(){
    int n;
    cin>>n;
    // find 2 ki power n;
    //! Recursive relation kya hoga
    //? 2^3 => 2 * (3-1) => 2 * 2 * (2-1)
    //* F(n) => 2 * F(n-1);
    int ans = power(n);
    cout<< ans << endl;
    return 0;
}