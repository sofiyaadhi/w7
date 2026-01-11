package week10;

public class Student
{
    private int rollNo;
    private String name;
    protected int marks;
    
    public Student(int rollNo,String name,int marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    
    public int getRollNo() 
    {
        return rollNo;
    }

    public void setRollNo(int rollNo) 
    {
        this.rollNo = rollNo;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getMarks() 
    {
        return marks;
    }

    public void setMarks(int marks) 
    {
        this.marks = marks;
    }

    public String calculateResult() 
    {
        if (marks >= 40)
        {
            return "Pass";
        }
        else
        {
            return "Fail";
        }
    }

    @Override
    public String toString() 
    {
        return "Roll No: " + rollNo +", Name: " + name +", Marks: " + marks;
    }

}