import java.lang.Math;
class ArrayNumber

{
public static void main(String[]arg)
{

int[]array={0,1,2,3,4,5};
for(int value:array){
System.out.println("value");
}
for(int i=0 ; i<array.length;i++){
array[i]=(int)Math.pow(array[i],2);
}
for(int value:array){
System.out.println(value);
}

}
}
