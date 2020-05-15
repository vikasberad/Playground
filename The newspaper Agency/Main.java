#include<iostream>
using namespace std;
int main()
{
  int w,x,y,o;
//cout<<enter the number of copies sold;
  cin>>w;
//cout<<Enter the cost of 1 copy of the newspaper;
  cin>>x;
//cout<<Enter the cost spent by the agency on 1 copy of the newspaper;
  cin>>y;
  o=((w*x)-(w*y))-100;    
  cout<<o;
}
