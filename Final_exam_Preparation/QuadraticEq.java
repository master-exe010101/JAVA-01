import java.util.Scanner;
public class QuadraticEq{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the value of a : ");
        float a = input.nextFloat();
        System.out.print("Enter the value of b : ");
        float b = input.nextFloat();
        System.out.print("Enter the value of c : ");
        float c = input.nextFloat();

        double d = Math.pow(b , 2) - 4*a*c;
        if (d > 0) {
            double x1 = ((-b + Math.sqrt(d))/(2*a));
            double x2 = ((-b - Math.sqrt(d))/(2*a));
            System.out.println("Roots are real and the value are " + x1 + " and " + x2 );
            

        }
        else if (d==0){
            float x = (-b/(2*a));
            System.out.println("Roots is real and the value is " + x);

        }
        else {
            System.out.println("Roots are imaginary");

        }
    }
        
}







        