#include<iostream>
using namespace std;

int find_power(int n, int base){
    //! Base Case
    if(base == 0){
        //? if base is even
        return 0;
    }
    if(base == 1){
        //? if base is odd
        return n;
    }
    //! Recursion call
    int ans = find_power(n , base/2);

     //? if base is even
     if(b%2 == 0){
        return ans * ans;
     }

    //? if base is odd
    else{
        return n * ans * ans;
    }
}

int main(){
    int n,b;
    cin >> n >> b;
    // kisi bhi number ki kitni bhi power find karni h
    //? n =2 , b = 3 => 8
    //! Recursive relation
    //* F(a,b) => F(a,b/2)
    int out = find_power(n,b);
    cout << out << endl;
    return 0;
}


/*                   _> [b is even => a^(b/2) * a^(b/2)
                    |
    find_power(a,b) |
                    |_> [b is odd ] => a * {a^(b/2) * a^(b/2)}
                    
*/            



/*
                        find_power(2 , 5) //? [odd] => 2 * 4 * 4 = 32
                            /
                    find_power(2, 4) //? [even] => 4
                        /
                find_power(2, 2) //? [even] => 2
                    /
            find_power(2, 0) => //? [even] => 0
                /
            ? BASE condition

*/

