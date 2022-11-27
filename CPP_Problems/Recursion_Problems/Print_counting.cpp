#include<iostream>
using namespaces std;

void count(int n){
     //Base case

     if(n == 0)
        return;
    //* Tail recursion
    cout << n << endl;
    //? 5 4 3 2 1
    count(n-1);
    //* Head Recursion
    // cout << n <<endl;
    //? 1 2 3 4 5
}

int main(){
    int n;
    cin>>n;
    //! Print counting from given n number
    //? 5 => 1 2 3 4 5
    //? 5 => 5 4 3 2 1
    // Recursive relation
    //* F(n) = F(n-1)
    count(n);
    return 0;
}