#include<iostream>
using namespace std;
int main()
{
 int n,i=0;
 std::cin>>n;
 while (n != 1)
 {
 std::cout << n << "\n";
 if (n%2 != 0)
 n = 3*n + 1;
 else
 n = n/2;
 i++;
 }
 std::cout<<n<<"\n";
 std::cout<<i;
 return 0;
} 