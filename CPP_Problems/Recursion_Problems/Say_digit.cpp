#include<iostream>
using namespaces std;

void digit(int n, string arr[]){

    // base Case
    if(n == 0){
        return;
    }
    int digit = n%10;
    // Tail recursion
    cout << arr[digit] << " ";  //? => 421 = one two Four 

    //! recursive call
    digit(n/10 ,arr);
    // Head Recursion
    cout << arr[digit] << " "; //? => 421 = Four two One

}

int main(){
    int n;
    cin>>n;
    // digit to counting name me change karna h
    //? 412 => Four one two
    //? 243 => Two Four Three
    //! reacursion relation
    //* digit(n) => digit(n/10)
    // mapping of number names in array
    //!   indexing       0     1     2     3       4      5     6     7       8        9
    string arr[10] = {'Zero','One','Two','Three','Four','Five','Six','Seven','Eight','Nine'};
    digit(n,arr);
    return 0;

}