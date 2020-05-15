#include <iostream>
using namespace std;
int main()
{
int units;
float amt, total_amt;
cin>>units;

if(units <= 200)
{
amt = units * 0.5;
}
else if(units <= 400)
{
amt = 100 + ((units-200) * 0.65);
}
else if(units <= 600)
{
amt = 200 + ((units-40) * 0.80);
}
else
{
amt = 425 + ((units-600) * 1.25);
}
//sur_charge = amt * 0.20;
total_amt = amt;
cout<<"Rs."<<(int)total_amt;
return 0;
}
