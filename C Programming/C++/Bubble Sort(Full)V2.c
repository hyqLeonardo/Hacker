#include <stdio.h>
#define num 10
main()
{
	int n,i,j,t,a[num];
	printf("please input 10 numbers:\n");
	for(n=0;n<10;n++)
	{
		scanf("%d",&i);
		a[n]=i;
		printf("%d\n",a[n]);
	}
	for(i=0;i<9;i++)
	{
		for(j=0;j<9-i;j++)
		{
			if(a[j]<a[j+1])             //小于号的结果是从大到小，大于号的结果是从小到大，只需要改这一个符号就OK
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			printf("the zero cicle is :%d\n",a[j+1]);   //可以追踪每次 两个a[num]中的值 的交换情况 ! !
		}
		for(n=0;n<10;n++)
		{
			printf("the first circle is :%d\n",a[n]);
		}
	}
	for(n=0;n<10;n++)
	{
		printf("the second circle is :%d\n",a[n]);
	}

}
	