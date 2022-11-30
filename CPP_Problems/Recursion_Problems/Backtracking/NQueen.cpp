#include<iostream>
using namespace std;

void addsolution(vector<vector<int>> &ans, vector<vector<int>> &board,int n){

    vector<int> temp;
    //* Store the valid solution in empty chess board
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            temp.push_back(board[i][j]);
        }
    }
    ans.push_back(temp);
}

bool issafe(int row, int col,vector<vector<int>> &board,int n){

    int x = row;
    int y = col;

    //check for same row
    while(y<=0){
        if(board[x][y] == 1){
            return false;
        }
        y--;
    }
    // check for diagonal
    int x = row;
    int y = col;

    while(x>=0 && y<=0){
        if(board[x][y] == 1){
            return false;
        }
        y--;
        x--;
    }
    //check for same column
    int x = row;
    int y = col;

    while(x<=n && y<=0){
        if(board[x][y] == 1){
            return false;
        }
        y--;
        x++;
    }
    return true;
    
}

void solve(int col, vector<vector<int>> &ans, vector<vector<int>> &board, int n){
    //! Base case
    if(col == n){
        addsolution(ans,board,n);
        return;
    }
    //! Solve 1 case and rest case recursion take care
    for(int row =0;row<n;row++){
        if(issafe(row,col,board,n)){
            board[row][col] = 1;
            solve(col+1,ans,board,n);
            // Backtrack
            board[row][col] = 0;
        }
    }
}

vector<vector<int>> nqueen(int n){
    vector<vector<int>> board(n,vector<int>(n,0));
    vector<vector<int>> ans;
    solve(0,ans,board,n);
    return ans;

}


int main(){
    // Find Queen ko kitne ways se place kar sakte h chess baord me
    /*
        ![-] Queen attack from 8 direction in NXN chess board
            ![#] Three conditions :
                ?✅ they share a same row.
                ?✅ they share a same column.
                ?✅ they share a diagonals.

                    ⇖ ⇑ ⇗
                   ⇐ 👑 ⇒
                    ⇙ ⇓ ⇘

        ![-] If 4X4 chess board then output =>
              0  1  2  3   [{i,j}{i,j}{i,j}{i,j}]
        ? 0 [⬛♟️⬛⬛]  [{0,0}{0,1}{0,2}{0,3}]
        ? 1 [⬛⬛⬛♟️]  [{1,0}{1,1}{1,2}{1,3}]
        ? 2 [♟️⬛⬛⬛]
        ? 3 [⬛⬛♟️⬛]

        ++++++++++++++++++++++++++++++++++++++
              0  1  2  3
        ? 0 [⬛⬛♟️⬛]
        ? 1 [♟️⬛⬛⬛] 
        ? 2 [⬛⬛⬛♟️]
        ? 3 [⬛♟️⬛⬛]
    */ 

   // using recursion with backtracking
   /*                                       
                                        ! Initial empty chess board

                                                [⬛⬛⬛⬛]
                                                [⬛⬛⬛⬛] 
                                                [⬛⬛⬛⬛]
                                                [⬛⬛⬛⬛]
                                ⇙

                    [👑⬛⬛⬛]        [⬛⬛⬛⬛]        [⬛⬛⬛⬛]      [⬛⬛⬛⬛]
                    [⬛⬛⬛⬛]        [👑⬛⬛⬛]        [⬛⬛⬛⬛]      [⬛⬛⬛⬛]
                    [⬛⬛⬛⬛]        [⬛⬛⬛⬛]        [👑⬛⬛⬛]      [⬛⬛⬛⬛]
                    [⬛⬛⬛⬛]        [⬛⬛⬛⬛]        [⬛⬛⬛⬛]      [👑⬛⬛⬛]

                ⇙    ⇘              

    [👑⬛⬛⬛]        [👑⬛⬛⬛]
    [⬛⬛⬛⬛]        [⬛⬛⬛⬛]
    [⬛👑⬛⬛]        [⬛⬛⬛⬛]
    [⬛⬛⬛⬛]        [⬛👑⬛⬛]
                            ⇘
                            [👑⬛⬛⬛]
                            [⬛⬛👑⬛] 
                            [⬛⬛⬛⬛]
                            [⬛👑⬛⬛]

   
   */
    int boardsize = 4;
    vector<vector<int>> answer = nqueen(boardsize);
    cout << answer <<endl;
    return 0;
}