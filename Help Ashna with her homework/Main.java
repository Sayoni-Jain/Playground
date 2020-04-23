#include<iostream>
int main()
{
  int a,b,sum,minus,mul,div,rem;
  std::cin>>a>>b;
  sum=a+b;
  minus=a-b;
  mul=a*b;
  div=a/b;
  rem=a%b;
  std::cout<<"a+b="<<sum<<"\n";
  std::cout<<"a-b="<<minus<<"\n";
  std::cout<<"a*b="<<mul<<"\n";
  std::cout<<"a/b="<<div<<"\n";
  std::cout<<"a%b="<<rem<<"\n";
}