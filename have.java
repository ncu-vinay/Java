import java.util.Scanner;
class complex
{
 int real, imag;
complex(int r, int i)
{
real=r;
imag=i;
}
void setcomplex()
{
 Scanner sc=new Scanner(System.in);
 real = sc.nextInt();
 imag  = sc.nextInt();
sc.close();
}
void Sum(complex c3, complex c4)
{
 real = c3.real+c4.real;
 imag = c3.imag+c4.imag;
}
}
class time
{
 public static void main(String []args)
{
 complex c1 = new complex(10,30);
// C1.SetComplex();
complex c2 = new complex(20,30);
//C2.SetComplex();
complex temp=new complex(0,0);
temp.Sum(c1,c2);
System.out.print(c1.real+":"+c1.imag);
}
}
