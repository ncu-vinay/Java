import java.util.Scanner;
class Time
{
 int hour; 
 int min; 
 int sec;
Time()
{
hour = 0;
min = 0;
sec = 0;
}
Time(int x, int y, int z)
{
hour = x;
min = y;
sec = z;
}
void display()
{
 System.out.println(hour + ":" + min + ":" + sec);
}
 Time add(Time X)
 {
  Time temp = new Time();
  temp.hour = this.hour + X.hour;
  temp.min = this.min + X.min;
  temp.sec = this.sec + X.sec;
 }
}
class Main
{
 public static void main(String args[])
 {
  Time res = new Time();
  Time Ob1 = new Time(2, 30, 4);
  Time Ob2 = new Time(3,30,4);
  res = Ob1.add(Ob2);
  res.display();
 }

}