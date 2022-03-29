class Pattern
{
  public static void main(String []arr) 
  {
   int Lspace;
   for(int i=1;i<=4;i++)
   {
    for(Lspace=1;Lspace<=4-i;Lspace++)
    {
     System.out.print(" ");
    }
    for(int col=1;col<=7-2*(Lspace-1);col++)
    {
     System.out.print("*");
    }
    System.out.println( );
   }
  }
}