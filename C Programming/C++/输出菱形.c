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
    puts("Please enter a letter (A-Z): "); /*可以是任意字符*/
    scanf("%c",&a); 
	getchar();   /*  为何将此行去掉， 运行结果完全不对。 前面调用的函数info()，就只能输入一个了?  */ 
    return a;    /*上面的问题是百度上问的，为啥我删了之后结果一样？*/

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
/*Answer: 首先用info()来初始化x和y的值然后调用diamond()画出一个由xy组成的图形，除去getchar()后会得到异常的图形好像被输入了很多回车符，
          问题就在这里。如果去除info()中的getchar()，当你第一次调用info()时scanf从stdin标准输入流得到了一个字符比如说'm'，
		  当你回车的时候'm'会被输入到内存a中，但是回车符'\n'还在stdin中，此后你初始化y时scanf就把回车符'\n'输入到a中并且认为输入已经结束了，
		  所以你这时就没有机会第二次输入，那么y也就自然被初始化成了回车符'\n',得到的图形就很奇怪，getchar()的作用就是清空第一次缓存区残留的
		  回车符，使它不影响第二次输入，所以只要在输入之后清空stdin缓存就可以了，所以也可以用fflush(stdin)代替getchar(),
		  当然也可以用scanf("%c",&b)这种形式代替getchar ，总之问题的关键点在于清空第一次输入后stdin缓存区残留的回车符 
