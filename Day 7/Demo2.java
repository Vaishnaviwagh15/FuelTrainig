import java.util.*;
class Test {
int i,j;
void add(){
System.out.println(i+j);
}
void setij(int x, int y){
i = x;
j = y;
}
}
class Demo2{
public static void main(String[] args){
Test t1=new Test();
Test t2=null;
t1.setij(10,20);
t2=t1;
t2.setij(30,40);

t1.add();
t2.add();

}
}