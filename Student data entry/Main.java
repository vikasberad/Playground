#include <iostream>
struct student
{
char name[50];
int roll;
float marks;
};
int main()
{
struct student a;
std::cin.getline(a.name,20);
std::cin>>a.roll;
std::cin>>a.marks;
std::cout<<"\n";
std::cout<<"Student Details"<<"\n";
std::cout<<"Name: "<<a.name<<"\n";
std::cout<<"Roll: "<<a.roll<<"\n";
std::cout<<"Marks: "<<a.marks<<"\n";
}