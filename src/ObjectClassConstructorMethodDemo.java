class Calc
{
    int num1;
    int num2;
    int result;
    double Result;

    public Calc()                     //Constructor name should be same as Class name
    {                                 //Constructor 1
        num1 = 5;
        num2 = 5;
        Result = num1 + num2;
        System.out.println("In Constructor");
    }
    public Calc(int num1, int num2)   //Constructor 2
    {
        this.num1 = num1;
        this.num2 = num2;
        this.Result = num1 - num2;
        System.out.println("In constructor 2");
    }
    public Calc(double d,int n)       //Constructor 3
    {
        num1 = (int)d;
        num2 = n;
        Result = num1 * num2;
        System.out.println("In Constructor 3");
    }


}
public class ObjectClassConstructorMethodDemo
{
    public static void main(String[] args)
    {

        Calc obj;                      //Reference
        obj = new Calc(2.0,5);           //Constructor is Calc() new always makes object
        System.out.println("Number 1 : "+obj.num1);
        System.out.println("Number 2 : "+obj.num2);
        System.out.println("Result   : "+obj.Result);

    }
}