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
		for(n=0;n<10;n++)                 //���Debug���԰�ÿ�αȽ����˳��仯����ʾ������
		{
			printf("��һ��ѭ��ֵa[i]=%d\n",a[n]);
		}
		putchar('\n');
	}
	for(i=0;i<10;i++)
	{
		putchar('\n');
		printf("�ڶ���ѭ��ֵa[i]=%d\n",a[i]);
	}

}

