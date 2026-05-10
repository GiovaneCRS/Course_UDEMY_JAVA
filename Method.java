class Calculator
{
    public int add(int n1, int n2, int n3, int n4)
    {
     return n1 + n2 + n3 + n4;
    }
    public int add1(int n1, int n2)
    {
        return n1 - n2;
    }
}

public class Method {
    public static void main(String[] args)
    {
            Calculator obj = new Calculator();
        int r1 = obj.add(7, 4, 6 ,1);
        System.out.println(r1);
    }
}
