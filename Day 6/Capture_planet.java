/*2. Create a class that captures planets. Each planet has a name, a distance from the sun, and its
gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures
real numbers. Make objects for Earth and your favorite non-earth planet.*/

class Captureplanet
{
String planetname;
double dos; 
double gravityrelative;

Captureplanet(String a, double b, double c)

{

this.planetname = a;
this.dos=b;
this.gravityrelative=c;
}
 void display()

{

System.out.println("planet name: " +planetname); 
System.out.println("distance from sun: " +dos);
System.out.println("gravity relative to earth: " +gravityrelative);

}

}

public class Capture_planet
{

public static void main(String[] args)
{

Captureplanet p1= new Captureplanet ("Earth ", 56667, 9.3); 
Captureplanet p2= new Captureplanet("uranus ", 78667, 7.3);

p1.display(); 
p2.display();

}

}