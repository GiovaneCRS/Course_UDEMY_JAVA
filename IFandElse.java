public class IFandElse
{
    public static void main(String[] args)
    {
        int nota = 80;
        char grade = 'B';

        if(nota>=50){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        if(nota>=90){
            System.out.println("Grade: A");
        }else if(nota>=75){
            System.out.println("Grade: B");
        }else if(nota>=60){
            System.out.println("Grade: C");
        }else{
            System.out.println("Grade: D");
        }
    
    }


}
