import java.util.Scanner;

public class main{
    public static void main(String[] args){
        int sum , i ;
        Scanner input = new Scanner(System.in);
        
        
        sum=0;
        for (i= 1 ; i <=10 ; i++){
            sum += i;
        }
        System.out.println("ans is " + sum);
    }
}


