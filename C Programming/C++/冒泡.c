#include <stdio.h>
#define num 10  //*必须在这里定义‘num’，否则后面的出错
main()
{
	int i,j,t,a[num]={9,4,6,8,1,2,5,37,21,5};
	for(i=0;i<num;i++)
	{
		printf("a[i]=%d\n",a[i]);
	}
	putchar('\n');
	for(i=num-1;i>0;i--)
	{
		for(j=0;j<i;j++)
		{
			if(a[j]<a[j+1])
			{
				t=a[j];
			    a[j]=a[j+1];
			    a[j+1]=t;
			}
		}
	}
	for(i=0;i<num;i++)
	{
		printf("a[i]=%d\n",a[i]);
	}
	return 0;
}
