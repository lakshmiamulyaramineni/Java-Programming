class Quadrilateral
{
    public static void area(){
        int area;
    }
}
class Rectangle extends Quadrilateral
{
    public static int area(int a,int b)
    {
       int ab=a*b;
        return ab;
    }
}
class Parallelogram extends Quadrilateral
{
    public static int area(int a,int b)
    {
        int ab=a*b;
        return ab;
    }
}
class Square extends Quadrilateral
{
    public static int area(int a)
    {
        int ab=a*a;
        return ab;
    }
}
public class CalculateArea
{
    public static void main(String args[])
    {
    int a=10,b=5;
    Square sq=new Square();
    Rectangle rec=new Rectangle();
    Parallelogram pg=new Parallelogram();
    System.out.println("Area of sqauare : "+sq.area(a));
    System.out.println("Area of Rectangle : "+rec.area(a,b));
    System.out.println("Area of parallelogram :"+pg.area(a,b));
    }
