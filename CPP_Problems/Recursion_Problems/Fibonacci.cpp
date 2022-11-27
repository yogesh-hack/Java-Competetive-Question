#include<iostream>
using namespaces std;

int fibonacci(int n){

    //! Base case
    if(n == 0){
        return 0;
    }
    else if(n == 1){
        return 1;
    }
    return fib(n-1) + fib(n-2);
}

int main(){
    int n;
    cin >> n;

    // hume find karni h Nth Position par kno si digit h fibonacci series me
    //? => 0 1 1 2 3 5 8 13 21 .........
    //? 8th par => 13 digit h 
    //! recursive relation
    //* fib(n) = fib(n-1) + fib(n-2)

    int ans = fibonacci(n);
    cout << ans << endl;
    return 0;
}