import java.util.Scanner;
public class switch_statement{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's Mark (out of 100): ");
        int Mark = input.nextInt();
        String grade;
        switch(Mark/10){
            case 10:
            case 9:
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "A-";
                break;
            case 5:
                grade = "B";
                break;
            case 4:
                grade = "C";
                break;
            
            default:
                grade = "F";
                


        }
        System.out.println("The student's grade is: " + grade);
    }
}