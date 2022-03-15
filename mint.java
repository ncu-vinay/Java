import java.util.*;
class Minutes
{
  public static void main(String []arr) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter minutes-");
    int mint = sc.nextInt();
    int year = mint/ 525960;
    int rmint = mint%525960;
    int month = rmint/43800;
    rmint= rmint%43800;
    int days = rmint/1440;
    rmint=rmint%1440;
    int hours=rmint/60;
    rmint=rmint%60;
    System.out.println(year+":"+month+":"+days+":"+hours+":"+rmint);
  }
}