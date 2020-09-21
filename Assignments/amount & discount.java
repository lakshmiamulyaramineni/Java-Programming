import java.util.Scanner;
public class BookFair
{
    String Bname;
    double price;
    public void BookFair()
    {
        Bname="";
        price=0.0;
    }
    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book name:");
        Bname=sc.nextLine();
        System.out.println("Enter price of the book:");
        price=sc.nextDouble();
    }
    public void calculate()
    {
        double discount=0;
        if (price<=1000)
        {
            discount=((2*price)/100);
        }
        else if (price>1000 & price<=3000)
        {
            discount=((10*price)/100);
        }
        else if (price>3000)
        {
            discount=((15*price)/100);
        }
        price=price-discount;
    }
    public void display()
    {
        System.out.println("Name of the book is :"+Bname+" ,and Price after discount is :"+price+".");        
    }
    public static void main(String[] args) {
        BookFair bookFair = new BookFair();
        bookFair.Input();
        bookFair.calculate();
        bookFair.display();
}
}