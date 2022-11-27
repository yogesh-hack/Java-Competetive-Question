#include<iostream>
using namespaces std;

int fact(int n){

    //! base case

    if(n == 0){
        return 1;
    }
    /*
    // int small_Problem = fact(n-1);
    // int Big_Problem = n * small_Problem;

    // return Big_Problem;
     */
    return n * fact(n-1);
}

int main(){
    //! recursive Relation
    // F(n) => n * F(n-1)
    int n;
    cin>>n;
    int ans = fact(n);
    cout<<ans<<endl;
    return 0;
}