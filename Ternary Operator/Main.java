#include<iostream>
using namespace std;
int main()
{
	int x,y;
    cin>>x;
    y = ((x%2)==0 )?true:false;
  
  if(y==1)
    cout<<"Even";
  if(y==0)
    cout<<"Odd";
 }