//EXPERIMENT-10



import java.io.*;
import java.util.*;
class RationalNumber
{
    int n,d;//numerator,denominator respectively
    void readInput()
    {
           Scanner in=new Scanner(System.in);
           System.out.println("Enter the numerator");
           n=in.nextInt();
           System.out.println("Enter the denominator");
           d=in.nextInt();
    }
    int calculate()
   {
          int i;
          int k=(n<d)?n:d;
          for(i=k;i>1;i--)
         {
                  if((n%i==0)&&(d%i==0))
                  break;
         }
         return i;
   }
   void displayOutput(int gcd)
   {
         if(n==0)
        {
               System.out.println("Numerator cannot be zero it is invalid");
        }
        else if(d==0)
        {
               System.out.println("Denominator cannot be zero it is invalid");
        }
        else
        {
             
              n=n/gcd;
              d=d/gcd;
              System.out.println("The resultant value is:"+numerator+"/"+denominator);
        }
   }
}
class Main
{
    public static void main(String args[])
    {
            RationalNumber rational=new RationalNumber();
            rational.readInput();
            int gcd=rational.calculate();
            rational.displayOutput(gcd);
    }
}