#include<iostream>
int main()
{
 int i,j;
 int n,temp;
 std::cin>>n;
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=i;j++)
 {
 if(j<i)
 std::cout<<i<<"*";
 else
 std::cout<<i;
 }
 printf(" \n");
 }
 for(i=n;i>=1;i--)
 {
 for(j=1;j<=i;j++)
 {
 if(j<i)
 std::cout<<i<<"*";
 else
 std::cout<<i;
 }
 printf(" \n");
 }
 return 0;
}