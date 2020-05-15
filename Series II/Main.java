#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int temp,x,i;
 std::cin>>x;
 int f=11;
 for(i=1;i<=x;i++)
 {
 temp=pow(f,2);
 f=f+4;
 std::cout<<temp<<" ";
 continue;
 }
}