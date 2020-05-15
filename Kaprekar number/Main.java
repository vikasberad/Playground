#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int a,temp,i,count,x,k,y;
 std::cin>>a;
y=a;
 while (y != 0) {
 y = y / 10;
 ++count;
 }
 temp=a*a;
 x=pow(10,count);
 k=(temp%x)+(temp/x);
 if(k==a)
 std::cout<<"Kaprekar Number";
 else
 std::cout<<"Not a Kaprekar Number";
} 