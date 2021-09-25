#include <bits/stdc++.h> 
using namespace std; 
#define ll long long 
void solve(); 
int main() 
{ 
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL); 
   
// #ifndef ONLINE_JUDGE 
//     freopen("input.txt", "r", stdin); 
//     freopen("error.txt", "w", stderr); 
//     freopen("output.txt", "w", stdout); 
// #endif 
   
    ll int t=1; 
    // /is Single Test case?/ 
     
    cin >> t; 
     
    // t=1;  
    //@cpsolutions 
    //single test case  -= Delete if t testCases =- 
     
    while (t--) { 
        solve(); 
        cout << "\n"; 
    } 
   
    // cerr << "time taken : " << (float)clock() / CLOCKS_PER_SEC << " secs" << endl; 
    // int z; 
    // cin>>z; 
    return 0; 
} 
 
void solve() 
{ 
    int n;cin>>n; 
    if(n%4 != 0){ 
        cout<<"NO"; 
        return; 
    } 
    cout<<"YES"<<endl; 
    vector<int> v1; 
    vector<int> v2; 
    int a = 1; 
    int b = n; 
    int flag = 0; 
    int check = n/2; 
    while(check){ 
        if(flag == 0){ 
            v1.push_back(a); 
            a++; 
            flag = 1; 
        } 
        else { 
            v1.push_back(b); 
            b--; 
            flag = 0; 
        } 
        check--; 
    } 
    for(int i=a;i<=b;i++){ 
        v2.push_back(i); 
    } 
    sort(v1.begin(),v1.end()); 
    sort(v2.begin(),v2.end()); 
    for(auto i:v1) cout<<i<<" "; 
    cout<<endl; 
    for(auto i:v2) cout<<i<<" "; 
 
} 