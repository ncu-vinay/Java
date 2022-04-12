import java.util.Scanner;

class Menu
{
   public static void main(String[] args)
   {
      int choice = 0;
      int[] a = new int[5];
      Scanner s = new Scanner(System.in);
     
      System.out.print("Enter 5 Numbers for the Array: ");
      for(int i=0; i<5; i++)
         a[i] = s.nextInt();
      
      System.out.println("----------------MENU---------------");
            System.out.println();
            System.out.println("1. Add");
            System.out.println("2. Alternate Add");
       choice= s.nextInt();  
       if (choice == 1)
       {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
         sum += a[i];
        }
         System.out.println(sum);
       }
       else
       {
        int jam=0;
        for(int i=0;i<a.length;i++)
 
        {
         if(i % 2 != 0)
         {
         jam += a[i];
        
         }
          System.out.println(jam);
        }
       }
}
}