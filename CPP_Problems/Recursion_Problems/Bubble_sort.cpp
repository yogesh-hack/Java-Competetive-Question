#include<iostream>
using namespace std;

void bubble_sort(int& arr, int n){
    //! Base condition
    if(n == 0 || n == 1){
        return;
    }

    for(int i=0;i<=n;i++){
        if(arr[i] > arr[i+1]){
            swap(arr[i],arr[i+1]);
        }
    }
    //!Recursion call
    bubble_sort(arr,n-1);
}

int main(){
    int n;
    cin >> n;
    int arr[n] ={5,2,1,8,1,0,3,10,31,20};
    bubble_sort(arr,n);
    cout << arr << " ";
    return 0;
}



/*
                    sort([3,1,2,5,0],5)
                        /
                sort([1,2,5,0,3],4)
                    /
            sort([1,2,0,3,5],3)
                /
        sort([1,0,2,3,5],2)
            /
    sort([0,1,2,3,5],1)
        /
 ? Base condition

*/