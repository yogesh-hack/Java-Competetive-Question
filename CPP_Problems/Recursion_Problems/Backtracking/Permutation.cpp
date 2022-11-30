#include <bits/stdc++.h> 
using namespace std;
void solve(string &s,int start, int end,vector<string> &ans){
    // Base case
    if(start == end){
        ans.push_back(s);
        return;
    }
    // swap each character of a string
    for(int i=start;i<=end;i++){
        swap(s[start],s[i]);
        solve(s,start+1,end,ans);
        //backtrack
        swap(s[start],s[i]);
    }
}


vector<string> findPermutations(string &s) {
    // Write your code here.
    vector<string> ans;
    int start = 0;
    int end = s.length()-1;
    solve(s,start,end,ans);
    return ans;
}
int main(){
    //! Find the permutation of a string
    string str;
    cin >> str;
    int index = 0;
    vector<string> output = findPermutation(str);
    cout<<output<<endl;
    return 0;
}



/*
                                     ! Recursion Tree of permutation of strings

                                                    solve("abc",0)
                                            ⇙           ⇓                       ⇘
                                solve("abc",1)       solve("bac",1)             solve("cba",1)
                            ⇙           ⇘          ⇙            ⇘               ⇙               ⇘
                solve("abc",2)  solve("acb",2)  solve("bac",1) solve("bca",2)   solve("cba",2)  solve("cab",2)
                      ⇓             ⇓               ⇓               ⇓               ⇓               ⇓             
                solve("abc",3)  solve("acb",2)  solve("bac",2)  solve("bca",2)  solve("cba",2)  solve("cab",2)
                                            

*/