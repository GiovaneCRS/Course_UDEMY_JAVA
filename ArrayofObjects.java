class Student
{
    int rollno;
    String name;
    int marks;
}

public class ArrayofObjects 
{   
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Vlad";
        s1.marks = 45;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Joseph";
        s2.marks = 17;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Harshel";
        s3.marks = 68;
    }
}
