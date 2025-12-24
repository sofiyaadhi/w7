package week7;


public class result
{
    int sub1;
    int sub2;
    int sub3;
    public result(int sub1,int sub2, int sub3)
    {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }
    void total()
    {
        System.out.println("total:" +(sub1+sub2+sub3));
    }
    
    void percentage()
    {
        double a= (sub1+sub2+sub3)/3 ;
        System.out.println("percentage:" +a);
    }
}