package Relationals;
public class Relationals
{
    public static void main(String[] args)
    {
        //double x = 3.5;
        //double y = 4.5;

        //boolean result = x <= y;
        //System.out.println(result);

        int a = 20;
        int b = 10;
 
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        boolean IsGreatter =  a > b;
        boolean LogicalCheack = a > b && b > 0;

        System.out.println("is greather than B? " + IsGreatter);
        System.out.println("is a > b and b > 0? " + LogicalCheack);
    }
}