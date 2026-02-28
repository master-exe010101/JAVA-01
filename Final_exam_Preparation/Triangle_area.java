import java.util.Scanner;
class Triangle{
    Triangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of number : ");
        int a = input.nextInt();
        System.out.print("Enter the value of number : ");
        int b = input.nextInt();
        System.out.print("Enter the value of number : ");
        int c = input.nextInt();

        if (((a+b)>c) && ((b+c)>a) && ((c+a)>b)){
            double s = ((a+b+c)/2);
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Triangle area is " + area);

        }
        else{
            System.out.println("Tringle are not possible");
        }
    }
    
    
    
}

public class Triangle_area{
    public static void main(String [] args){
        Triangle obj = new Triangle();
        
        
    }
}

