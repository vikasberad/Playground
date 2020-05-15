#include<iostream>
using namespace std;
int printresult(int *a,int n,int s)
{
 int flag = 0;
 int temp=0;
 if(n>=2 && n<=100)
 {
 for(int i=1;i<=n;i++)
 {
 temp+=a[i];
 if(temp>s)
 {
 flag=1;
 break;
 }
 }
 if(flag==1)
 {
 return 0;
 }
 else
 {
 return 1;
 }
 }
}
int main()
{

 int n,s,a[n];
 cin>>n>>s;
 for(int i=1;i<=n;i++)
 {
 cin>>a[i];
 }
 if(printresult(a,n,s))
 cout<<"YES";
 else
 cout<<"NO";
 return 0;
}