#include <stdio.h>                      //"Bubble Sort"  Full Edition ! !
#define num 10
main()
{
	int i,j,n,t,a[num];
	printf("please input 10 numbers\n");
	for(n=0;n<10;n++)
	{
		scanf("%d",&a[n]);
		printf("a[n]=%d\n\n",a[n]);
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
		}
		for(n=0;n<10;n++)                 //这个Debug可以把每次比较完的顺序变化都显示出来！
		{
			printf("第一层循环值a[i]=%d\n",a[n]);
		}
		putchar('\n');
	}
	for(i=0;i<10;i++)
	{
		putchar('\n');
		printf("第二层循环值a[i]=%d\n",a[i]);
	}

}

