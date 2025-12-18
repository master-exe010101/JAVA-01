import java.util.Scanner;

public class tringle {
    public static void main(String[] args){
        Tringle_area obj = new Tringle_area();
        obj.area();
    }
}

class Tringle_area{
    public void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a");
        int a = input.nextInt();
        System.out.print("Enter the value of b");
        int b = input.nextInt();
        System.out.print("Enter the value of c");
        int c = input.nextInt();
        double s = ( a + b + c)/2;
        if ((a+b)>c && (a+c)>b && (b+c)>a ) {
            double area = s * (s-a) * (s-b) * (s-c);
            System.out.println("The area is" + area);


        
        }
        else{
            System.out.println ("Tringle are not possible");
        }
        
    }
}





