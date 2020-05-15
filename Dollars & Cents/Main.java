#include<iostream>
using namespace std;
int main()
{
 int fd,fc,sd,sc,td,tc,xd,xc;
 std::cin>>fd>>fc>>sd>>sc;
 tc=fc+sc;
 td=fd+sd;
xc=tc%100;
xd=td+(tc/100);
 std::cout<<xd<<"\n"<<xc;
return 0;
} 