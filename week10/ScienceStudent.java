package week10;



public class ScienceStudent extends Student
{
    public ScienceStudent(int rollNo, String name, int marks) 
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() 
    {
        if (super.calculateResult().equals("Pass") && marks >= 50)
            return "Pass (Science)";
        else
            return "Fail (Science)";
    }

    public String calculateResult(int graceMarks) 
    {
        int total = marks + graceMarks;
        if (total >= 50)
            return "Pass (Science with Grace)";
        else
            return "Fail (Science)";
    }
    
    
}