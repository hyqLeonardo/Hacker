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
			if(a[j]<a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			printf("the zero cicle is :%d\n",a[j+1]);
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
	