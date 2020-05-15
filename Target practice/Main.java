#include<iostream>
int main()
{
 int n,a,c=0,s=0;
 std::cin>>n;
 do
 {
 c++;
 std::cin>>a;
 s=s+a;
 }while(s<n);
 std::cout<<"The number of turns is "<<c;
 return 0;
} 
