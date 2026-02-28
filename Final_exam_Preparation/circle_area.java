import java.util.Scanner;
class Circle{
    Circle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the redius : ");
        float r = input.nextFloat();
        double area = Math.PI * Math.pow(r,2);
        System.out.println("The area is " + area);
    }
}
public class circle_area{
    public static void main(String [] args){
        Circle obj = new Circle();
        
    }
}

