#include<iostream>
using namespace std;
int main()
{
 int n,i;
 std::cin>>n;
 for(i=1;i<=n;i++)
 {
 if(i%2 == 0)
 std::cout<<i*i-2<<" ";
 else
 std::cout<<i*i-1<<" ";
 }
} 