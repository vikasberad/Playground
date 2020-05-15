#include <iostream> 
using namespace std;
bool isMagicSquare()
{ int n,r,c,i,j;
 std::cin>>r;
 int mat[r][r];
 for(i=0;i<r;i++)
 {
 for(j=0;j<r;j++)
 std::cin>>mat[i][j];
 }
 int sum = 0,sum2=0;
 for (int i = 0; i < r; i++)
 sum = sum + mat[i][i];
 for (int i = 0; i < r; i++)
 sum2 = sum2 + mat[i][r-1-i];
 if(sum!=sum2)
 return false;
 for (int i = 0; i < r; i++) {
 int rowSum = 0;
 for (int j = 0; j < r; j++)
 rowSum += mat[i][j];
 if (rowSum != sum)
 return false;
 }
 for (int i = 0; i < r; i++) {
 int colSum = 0;
 for (int j = 0; j < r; j++)
 colSum += mat[j][i];
 if (sum != colSum)
 return false;
 }
 return true;
}
int main()
{
 if (isMagicSquare())
 cout << "Yes";
 else
 cout << "No";

 return 0;
}