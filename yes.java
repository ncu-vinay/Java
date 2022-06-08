class Resizeablecircle  extends circle implements Resizeable 
{
 Resizeablecircle(double r)
 {
  super(r);
 }
 //@override
 public void resize(int percent)
 {
 }
}
interface Resizeable
{
 public void resize(int percent);
}
class circle implements geometricobject
{
 double radius;
 circle(double radius)
 {
  this.radius = radius;
 }
 public double getperimeter()
 {
  double peri = 2*3.14*radius;
  return peri;
 }
 public double getarea()
 {
  double area = 3.14*radius*radius;
  return area;
 }
}
interface geometricobject
{
 public double getperimeter();
 public double getarea();
}
class main
{
 public static void main(String[] args) 
 {
  Resizeablecircle obj = new Resizeablecircle(1.0);  
    System.out.println(obj.getperimeter());
    System.out.println(obj.getarea());
    
  }
}