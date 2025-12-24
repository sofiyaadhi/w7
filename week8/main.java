package week8;


public class main
{
    public static void main(String[] args)
    {
        Calculator calc= new Calculator();
        calc.displayInfo();
        calc.add(10,20); //actual parameters
        
        calc.getFixedNumber();
        System.out.println(calc.getFixedNumber());
        
        int fixNum= calc.getFixedNumber();
        System.out.println("the fixed number is:"+ fixNum);
        
        int mul=calc.multiply(10,20);
        int mul1= calc.multiply(30,20);
        
        //static methods invocation or calling static methods
        int sqr= Calculator.square(20);
        System.out.println("the square of the given number is:"+ sqr);
        
        
    }
}