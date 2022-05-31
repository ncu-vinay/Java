class Time
{
 static void display()
 {
 System.out.print("Life");
 }
}
interface I
{
 void left();
}
interface J
{
 void time();
}
interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class C extends Time implements I, J, Showable
{
 static void display()
 {
  System.out.println("Time is left");
 }
 public void print()
 {
 System.out.println("Hello");
 }  
 public void show()
 {
  System.out.println("Welcome");
 }
 public void left()
 {
  System.out.println("Hello");
 }
 public void time()
 {
  System.out.println("i hour");
 }
 
 public static void main(String args[])
 {  
  C obj = new C();  
  obj.display();
  obj.left();
  obj.time(); 
  obj.print();  
  obj.show();     
 }  
}  