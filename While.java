public class While {
 
    public static void main(String[] args)
    {
        int a =1;
        
        while(a<=5)
            {
            System.out.println("hi: " + a);
            int b =1;
            while(b<=3)
                {
                    System.out.println("hello" + b);
                    b++;

                }
            a++;
            }
        System.out.println("Finish");
        }
}