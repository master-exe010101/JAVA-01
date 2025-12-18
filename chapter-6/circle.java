import java.util.Scanner;


class Circlearea
{
    public void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ener the number: ");
        int r = input.nextInt();
        double area = Math.PI * Math.pow(r,2);
        
        System.out.println(" The area is " + area);
        
        
        input.close();    
    }
    
    
}

public class circle {
    public static void main(String[] args){
        Circlearea obj = new Circlearea();
        obj.area();
    }
}

