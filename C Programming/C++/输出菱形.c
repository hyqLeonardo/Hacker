#include<stdio.h>
char info();
void diamond(char x, char y);

void main()
{
char x,y;
x=info();
y=info();
diamond(x,y);
}

char info()
{   
    char a;
    puts("Please enter a letter (A-Z): "); /*�����������ַ�*/
    scanf("%c",&a); 
	getchar();   /*  Ϊ�ν�����ȥ���� ���н����ȫ���ԡ� ǰ����õĺ���info()����ֻ������һ����?  */ 
    return a;    /*����������ǰٶ����ʵģ�Ϊɶ��ɾ��֮����һ����*/

}

void diamond(char x,char y)
{
int i,j,k;
    puts("Diamond shape of the letters: \n");
for(i=1;i<4;i++)
    putchar(' ');
putchar(x);
putchar('\n');

for(k=0;k<3;k++)
{
for(i=k;i<2;i++)
    putchar(' ');
putchar(x);
for(j=-1;j<2*k;j++)
    putchar(y);
putchar(x);
putchar('\n');
}

for(k=2;k>0;k--)
{
for(i=k;i<3;i++)
    putchar(' ');
putchar(x);
for(j=2*k-1;j>0;j--)
    putchar(y);
putchar(x);
putchar('\n');
}
for(i=1;i<4;i++)
    putchar(' ');
putchar(x);
puts("\nFinished!");
}
/*Answer: ������info()����ʼ��x��y��ֵȻ�����diamond()����һ����xy��ɵ�ͼ�Σ���ȥgetchar()���õ��쳣��ͼ�κ��������˺ܶ�س�����
          �������������ȥ��info()�е�getchar()�������һ�ε���info()ʱscanf��stdin��׼�������õ���һ���ַ�����˵'m'��
		  ����س���ʱ��'m'�ᱻ���뵽�ڴ�a�У����ǻس���'\n'����stdin�У��˺����ʼ��yʱscanf�Ͱѻس���'\n'���뵽a�в�����Ϊ�����Ѿ������ˣ�
		  ��������ʱ��û�л���ڶ������룬��ôyҲ����Ȼ����ʼ�����˻س���'\n',�õ���ͼ�ξͺ���֣�getchar()�����þ�����յ�һ�λ�����������
		  �س�����ʹ����Ӱ��ڶ������룬����ֻҪ������֮�����stdin����Ϳ����ˣ�����Ҳ������fflush(stdin)����getchar(),
		  ��ȻҲ������scanf("%c",&b)������ʽ����getchar ����֮����Ĺؼ���������յ�һ�������stdin�����������Ļس��� 
