import java.util.*;
class Minutes
{
  public static void main(String []arr) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter minutes-");
    int mint = sc.nextInt();
    int year = mint/ 525600;
    System.out.println("Years-" + year);
    int day = mint/1440;
    System.out.println("Days-" + day); 
    int month = mint/43200;
    System.out.println("Months-" +month);
  }
}