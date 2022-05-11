/*1. Create a class that captures students. Each student has a first name, last name, class year, and
major. Create two examples of students.*/

class Student
{
String fname; 
String lname;

int year; 
String major;

Student (String a, String b, int c, String d)
{

this.fname = a;
this.lname = b; 
this.year = c;
this.major = d;

} 
void display()

{

System.out.println("first name: "+fname); 
System.out.println("last name: "+lname); 
System.out.println("year:"+year);

System.out.println("major is:"+major);
}

}
class Day_six

{

public static void main(String[] args)
{

Student s1 = new Student ("Krishna", "Shelke",136, "cool"); 
Student s2 = new Student("Shivam", "Salunke",135, "Hot");

s1.display(); 
s2.display();

}

}