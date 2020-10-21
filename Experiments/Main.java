//EXPERIMENT-9


import java.io.*;
import java.util.*;
class Rational
{
    int n;//numerator
    int d;//denominator
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
    void displayResult(int gcd)
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
             System.out.println("The resultant value is:"+n+"/"+d);
         }
    }
}
class Main
{
    public static void main(String args[])
    {
            Rational ra=new Rational();
            ra.readInput();
            int gcd=ra.calculate();
            ra.displayResult(gcd);
    }
}