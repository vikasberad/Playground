#include <iostream>
using namespace std;
int power(int, int);
int main()
{
 int a,n,x;
 std::cout<<"Enter the value of a"<<endl;
 cin >> a;
 std::cout<<"Enter the value of n"<<endl;
 cin >> n;
 x = power(a, n);
 cout <<"The value of "<< a << " power " << n << " is " << x;
 return 0;
}
int power(int a, int n)
{
 if (n != 0)
 return (a*power(a, n-1));
 else
 return 1;
} 