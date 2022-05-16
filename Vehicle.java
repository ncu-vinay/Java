import java.util.*;
class Vehicle
{
 void display()
 {
  System.out.println("This ia a vehicle");
 }
}
class Car extends Vehicle
{
 void display()
 {
  System.out.println("This ia a car.");
 }
}
class Bike extends Vehicle
{
 void display()
 {
  System.out.println("This ia a bike.");
 }
}

class Main
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  Vehicle vehicle = new Vehicle();
  Car car = new Car();
  Bike bike = new Bike();
  switch(N)
  {
   case 2:
   {
    bike.display();
    break;
   }
   case 4:
   {
    car.display();
    break;
   }
   default:
   {
    vehicle.display();
   }
  }
 }
}