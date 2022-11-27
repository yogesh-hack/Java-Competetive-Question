#include<iostream>
using namespaces std;

void reverse(string& str,int i, int j){

    //! Base Case
    if(i > j){
        return;
    }
    swap(str[i],str[j]);
    i++;
    j--;

    //! Recursive call
    reverse(str , i, j)

    //? reverse(str, i++, j--);
}

int main(){
    string str;
    cin >> str;
    // String ko reverse karna h
    //? "abcde" => "edcba"
    //! [X] Recursion relation 
    //* {use two pointer approach} => i = first char && j = last char
    reverse(str,0,str.lenght()-1);
    return 0;
}


/*
            ["abcde" , 0 , (5-1)]
                /   
        ["ebcda", 1 , 3]
            /
    ["edcba" , 2 , 2]
        /
    ["edcba" , 3, 1]
        /
?? Base condition



*/