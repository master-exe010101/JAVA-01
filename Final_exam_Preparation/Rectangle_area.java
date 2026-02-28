import java.util.Scanner;
public class Rectangle_area{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        float a = input.nextFloat();
        System.out.print("Enter the value of b : ");
        float b = input.nextFloat();
        float area = a * b;
        System.out.println("The area is " + area) ;


    }
}