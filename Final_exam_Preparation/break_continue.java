import java.util.Scanner;
public class break_continue{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the number : ");
        int num2 = input.nextInt();
        int sum = 0;

        for (int i =1  ; i <=2 ; i++ ){
            if (i == 1){
                sum += num1;
                continue;

            }
            if (i == 2){
                sum += num2;
                break;

            }

        }
        System.out.println("The summation is " + sum);
    }
}