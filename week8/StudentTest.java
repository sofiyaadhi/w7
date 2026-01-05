package week8;

public class StudentTest
{
    public static void main(String [] args)
    {
        Student st1= new Student("Sofiya",101,"tinkune",1234567890L);
        st1.displayInfo();
        
        st1.setName("pareena");
        st1.setId(102);
        st1.setAddress("bhaktapur");
        st1.setPhoneNumber(9876543223l);
        
        st1.displayInfo();
    }
}