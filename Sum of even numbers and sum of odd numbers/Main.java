#include<iostream>
using namespace std;
int main()
{
 int n,i,odd=0,even=0;
 std::cin>>n;
 int arr[n];
 for(i=0;i<n;i++)
 {
 std::cin>>arr[i];
 if(arr[i]%2==0)
 {
 even=even+arr[i];
 }
 else
 odd=odd+arr[i];
 }
 std::cout<<"The sum of the even numbers in the array is "<<even<<endl;
 std::cout<<"The sum of the odd numbers in the array is "<<odd;
} 
