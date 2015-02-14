#include <stdio.h>
#define num 100
void main()
{
	int m,k,i,t,j,a[num];
	printf("please input m and k\n");
	scanf("%d,%d",&m,&k);
	for(i=0;i<k;i++)
	{
		int t=m+1+i;
		for(j=2;j<=t/2;j++)
		{
			if(t%j==0)
			break;
		}
		if(j>t/2)
		{
			a[i]=t;
			printf("first circle=\n",a[i]);
	}
	for(i=0;i<k;i++)
	{
		printf("a[num]=%d\n",a[i]);
	}
}
