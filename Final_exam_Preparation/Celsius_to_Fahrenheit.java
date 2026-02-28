import java.util.Scanner;
public class Celsius_to_Fahrenheit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of celsius:");
        double c = input.nextDouble();
        double f = (c*9/5)+32;
        System.out.println("Temperature in Fahrenheit: " + f );
    }
}

