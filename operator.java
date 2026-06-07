import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // System.out.println("Swap the two number:\n");
        // System.out.print("Enter value of A:");
        // int a=input.nextInt();
        // System.out.print("Enter value of B:");
        // int b=input.nextInt();
        //  int c=a;
        //  a=b;
        //  b=c;
        //  System.out.println("value of A is:"+a);
        //  System.out.println("value of B is:"+c);
        // System.out.print("Enter first number:");
        // float first=input.nextFloat();
        // System.out.print("Enter second number:");
        // float second=input.nextFloat();

        

        // // int add=first+second;
        // // int sub=first-second;
        // // int multiple=first*second;
        // // int divide=first/second;
        // // int module=first%second;

        // System.out.println("Add number:"+(first+second));
        // System.out.println("subtract number:"+(first-second));
        // System.out.println("mltiple number:"+(first*second));
        // System.out.println("Divide number:"+(first/second));
        // System.out.println("module number:"+(first%second));
       
        // System.out.println("calculater area of a triangle is :");
        // System.out.print("Enter triangle Breath :");
        // double B=input.nextDouble();
        // System.out.print("Enter Triangle Height :");
        // double H=input.nextDouble();
        // double Triangle = (B*H)/2;
        // System.out.println("Triangle of number is:"+ Triangle);
           System.out.println("calculate simple intest: \n");
           System.out.print("Enter principle amount: " );
           double p=input.nextDouble();
           System.out.print("Enter Time in year:");
           double T=input.nextDouble();
           System.out.print("Enter interest rate in %:");
           double R=input.nextDouble();
           double simple_intrest=(p*T*R)/100;
           System.out.println("Total simple intrest amount:"+simple_intrest);
    }
}