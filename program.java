import java.util.Scanner;

class Menu
{
   public static void main(String[] args)
   {
     int[] a = new int[5];
     Scanner sc = new Scanner(System.in);
        
     System.out.print("Enter 5 Numbers for the Array: ");
     for(int i=0; i<5; i++)
     {
      a[i] = sc.nextInt();
     }
     int n = a.length;
      System.out.println("----------------MENU---------------");
      System.out.println();
      System.out.println("1. Second largest");
      System.out.println("2. Total even number");
      System.out.println("N: Exit");
      char choice = sc.next().charAt(0);
      switch(choice)
      {
       case '1':
       {  
        for(int i = 0; i<n; i++ )
         {
          for(int j = i+1; j<n; j++)
          {
           if(a[i]>a[j])
           {
             int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
           }
          }
         }
         System.out.println(a[n-2]);
         break;
         
        }
      case '2':
        {
          int even = 0;
          for(int i = 0; i<n; i++ )
          {
          if (a[i]%2==0)
          {
           even = even +1;
          }
          }
         System.out.println(even);  
         break;
        }
       case 'n':
       case 'N':
       {
        break;
       } 
       
     
     }
     
  }
  
}