import java.util.Scanner;
public class largest_number{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the value of number: ");
        float a = input.nextFloat();
        System.out.print("Enter the value of number ");
        float b = input.nextFloat();
        System.out.print("Enter the value of number ");
        float c = input.nextFloat();
        System.out.print("Enter the value of number ");
        if (a>b && a>c ){
            System.out.println("The largest number is " + a);

        }
        else if (b>c && b>a) {
            System.out.println("The largest number is " + b);
        
        }

        else{
            System.out.println("The largest number is " + c);
        }

    }
}


