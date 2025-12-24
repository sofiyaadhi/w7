package week7;


public class main
{
    public static void mian(String[] args)
    {
        //className variable= naw className();
        
        student s1= new student();
        s1.collegeId= 1011;
        s1.name="sofiya";
        s1.age=19;
        
        s1.study();
        
        System.out.println(s1.collegeId);
        System.out.println(s1.name);
        System.out.println(s1.age);

        
        student s2= new student();
        s2.collegeId=1022;
        s2.name="pareena";
        s2.age=18;
        
        System.out.println(s2.collegeId);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        student s3= new student();
        s3.collegeId=1033;
        s3.name="nikisha";
        s3.age=19;
        System.out.println(s3.collegeId);
        System.out.println(s3.name);
        System.out.println(s3.age);


    }
}