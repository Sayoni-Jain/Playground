#include<iostream>
using namespace std;
int main()
{  int w,x,y,cost,sell,profit,diff;
   std::cin>>w;
   std::cin>>x;
   std::cin>>y;
 cost=w*y;
 sell=w*x;
 diff=sell-cost;
 profit=diff-100;
 std::cout<<profit;
  //Type your code here.
}