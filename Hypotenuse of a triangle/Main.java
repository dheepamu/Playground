#include<stdio.h>
int main()
{
  float opp,adj,hyp;
  scanf("%f%f",&opp,&adj);
   hyp=sqrt((opp*opp)+(adj*adj));
        printf("%0.2f",hyp);
  return 0;
}