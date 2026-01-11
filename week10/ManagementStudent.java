package week10;

public class ManagementStudent extends Student
{
    public ManagementStudent(int rollNo, String name, int marks) 
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() 
    {
        if (super.calculateResult().equals("Pass") && marks >= 45)
            return "Pass (Management)";
        else
            return "Fail (Management)";
    }

    public String calculateResult(int graceMarks) 
    {
        int total = marks + graceMarks;
        if (total >= 45)
            return "Pass (Management with Grace)";
        else
            return "Fail (Management)";
    }
}

