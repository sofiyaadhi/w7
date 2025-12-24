package week8;


public class Calculator
{
    //instsance method 
    //<access modifier><method-type><return-type><method-name>
    
    public void displayInfo()
    {
        System.out.println("welcome to the calculator app.");
        
    }
    
    // void return type+parameters
    public void add(int a, int b) //formal parameters
    
    {
        System.out.println("the sum of two numbers are: "+(a+b));
        
    }
    
    public void add(double a,double b)
    {
        System.out.println("the sum of two numbers of double type are: "+(a+b));
    }
    
    public void add(int a, int b, int c)
    {
        System.out.println("the sum of three numbers are: "+(a+b+c));
    }
    //return type + no parameters
    
    public int getFixedNumber()
    {
        return 10;
    }
    
    //return type + parameters
    public int multiply(int a, int b)
    {
        return a * b;
    }
    
    //static--> return type+ parameters
    
    public static int square(int a)
    {
        return a*a;
    }
    }