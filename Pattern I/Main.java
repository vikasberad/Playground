#include<iostream>
int main()
{
 int n,i,j;
 std::cin>>n;
 int temp1=n;
 for(i=1;i<=4;i++)
 {
 for(j=1;j<=i;j++)
 {
 std::cout<<temp1;
 }
 std::cout<<"\n";
 temp1++;
 }
 temp1--;
 int k,l;
 for(k=1;k<=4;k++)
 {
 for(l=4;l>=k;l--)
 {
 std::cout<<temp1;
 }
 std::cout<<"\n";
 temp1--;
 }
}