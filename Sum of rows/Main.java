#include <iostream>
using namespace std;
int main()
{
 int i,j,r,c,sum[r];
 std::cin>>r;
 std::cin>>c;
 int arr[r][c];
 for (i = 0; i < r; i++)
 {
 for (j = 0; j < c; j++)
 std::cin>>arr[i][j];
 }
 for (i = 0; i < r; i++)
 {
 for(j=0;j<c;j++)
 {
 sum[i]=sum[i]+arr[i][j];
 }
 std::cout<<sum[i]<<endl;
 }
} 