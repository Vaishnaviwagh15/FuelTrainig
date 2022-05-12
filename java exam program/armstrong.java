class ArmstrongNumber
{
public static void main(String[]arg)
{
int i=100,arm;
System.out.println("print armstrong Numberbetween 100 to 999");
while(i<1000)
{
arm=armstrongorNot(i);
if(arm==i)
System.out.println(i);
i++;
}
}
static int armstrongorNot(int num){
int x,a=0;
while(num!=0)
{
x=num%10;
a=a+(x*x*x);
num/=10;
}
return 0;
}
}