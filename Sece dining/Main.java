#include<iostream>
using namespace std;
int main()
{ int x;
 char c[6];
 cin>>c;
 cin>>x;
 if(c[0]=='f'){
 if(x==1){
 cout<<"Left Handed";
 }else{
 cout<<"Right Handed";

 }
 }else{
 if (x==1)
 cout<<"Right Handed";
 else
 cout<<"Left Handed";
 }
} 