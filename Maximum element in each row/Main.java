#include <iostream>
using namespace std;
int main()
{
 int i,j,l;
 int r,c;
 std::cin>>r>>c;
 int arr[r][c];
 for (i = 0; i < r; i++)
 {
 for (j = 0; j < c; j++)
 std::cin>>arr[i][j];
 }
 for(i=0;i<r;i++)
 {
 int max=arr[i][0];
 for(j=0;j<c;j++)
 {
 if(max<=arr[i][j])
 l=arr[i][j];
 }
 std::cout<<l<<endl;
 }
} 