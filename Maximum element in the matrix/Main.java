#include <iostream>
using namespace std;
int main()
{
 int i,j,l;
 int r,c;
 std::cin>>r>>c;
 int arr[r][c];
 int g[c];
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
 g[j]=l;
 }
 for(i=0;i<c;i++)
 {
 if(g[i]<g[i+1])
 {
 g[i]=g[i+1];
 g[i+1]=g[i+2];
 }
 }
 if(g[0]>g[1])
 {
 std::cout<<"The maximum element is "<<g[0];
 }
 else
 {
 std::cout<<"The maximum element is "<<g[1];
 }
} 