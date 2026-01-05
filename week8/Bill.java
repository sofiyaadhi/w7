package week8;


public class Bill
{public static void main(String[] args)
    {
        ElectricityBill e1= new ElectricityBill("Pareena", 150);
        System.out.println("Units Consumed: " + e1.getUnitsConsumed());
        System.out.println("Total Electricity Bill:" + e1.calculateBill());
    }

    
}