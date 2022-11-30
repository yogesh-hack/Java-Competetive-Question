#include<iostream>
using namespace std;

bool issafe(int newx, int newy, vector<vector<bool>> &visited,vector<vector<int>> &arr, int n){
    
    if((newx > 0 && newx < n) && (newy >= 0 && newy < n) && visited[newx][newy] == 0 && arr[newx][newy] == 1){
        return true;
    }
    return false;
}


void solve(int x, int y, vector<vector<int>> &arr, int n, vector<string> &ans, vector<vector<bool>> &visited,string path){

    //! Base case
    if(x = n-1 & y == n-1){
        ans.push_back(path);
        return;
    }

    // 4 movements => D L R U
    visited[x][y] = 1;
    // is Down movement safe
    if(issafe(x+1,y,visited,arr,n)){
        //!visited[x][y] = 1;
        solve(x+1,y,arr,n,ans,visited,path+'D');
        //!visited[x][y] = 0;
    }
    // is left movement safe
    if(issafe(x,y-1,visited,arr,n)){
        //!visited[x][y] = 1;
        solve(x,y-1,arr,n,ans,visited,path+'L');
        //!visited[x][y] = 0;
    }
    // is right movement safe
    if(issafe(x,y+1,visited,arr,n)){
        //!visited[x][y] = 1;
        solve(x,y+1,arr,n,ans,visited,path+'R');
        //!visited[x][y] = 0;
    }
    // is up movement safe
    if(issafe(x-1,y,visited,arr,n)){
        //!visited[x][y] = 1;
        solve(x-1,y,arr,n,ans,visited,path+'U');
        //!visited[x][y] = 0;
    }
    //* Backtrack
    visited[x][y] = 0;
}


vector<string> searchmaze(vector<<vector<int>> &arr, int n){
    vector<string> ans;
    vector<vector<bool>> visited(n,vector<bool> (n,0));
    string path ="";

    if(arr[0][0] == 0){
        return ans;
    }

    solve(0 , 0, arr ,n,ans,visited,path);
    return ans;
}


int main(){
    // hume rat ko source se destination tak pahuchana h
    //? source = [0][0]
    //? destination = [n-1][n-1]
    //* 1 -> open path
    //* 0 -> close path
    //* D -> Down  R -> right  U -> up  L -> left
    //! Input = 1 0 0 0
    //!         1 1 0 0
    //!         1 1 0 0
    //!         0 1 1 1
    //? output => "DDRDRR" , "DRDDRR"
    vector<vector<int>> arr = {{1,0,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
    int n = 4;
    searchmaze(arr,n);
    return 0;
}