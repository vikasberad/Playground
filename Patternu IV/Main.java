#include<iostream>
using namespace std;
int main()
{
 int n;
 std::cin>>n;
 for(int i=0;i<n;i++)
 {
 for(int j=0;j<n;j++)
 {
 if(i%2==0)
 {
 if(j==n-1)
 cout<<i+2;
 else
 cout<<i+1;
 }
 else if(i%2!=0)
 {
 if(j==0)
 cout<<i+2;
 else
 cout<<i+1;
 }
 }
 cout<<endl;
 }
 return 0;
} 
