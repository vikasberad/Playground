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
 for(j=0;j<c;j++)
 {
 for(i=0;i<r-1;i++)
 {
 if(arr[i][j]>arr[i+1][j])
 {
 l=arr[i][j];
 }
 else
 {
 l=arr[i+1][j];
 }
 }
 std::cout<<l<<endl;
 }
}