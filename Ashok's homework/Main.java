#include<iostream>
int main()
{
int r,c,i,j;
std::cin>>r>>c;
int a[r][c];
int b[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
std::cin>>a[i][j];
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
std::cin>>b[i][j];
}
int sum[r][c];
for(i = 0; i < r; i++)
for(j = 0; j < c; j++)
sum[i][j] = a[i][j] + b[i][j];
for(i = 0; i < r; ++i)
for(j = 0; j < c; ++j)
{
std:: cout << sum[i][j] <<" ";
if(j == c - 1)
std:: cout <<"\n";
}
}
