class over {
    int cal(int x , int y) {
        int z = x+y ;
        System.out.println("Result is " + z);
        return 0;


    }

    float cal ( float num1 , float num2) {
        float sum = num1 + num2;
        System.out.println("The summation is " + sum);
        return 0;


    }

    int cal (int x){
        System.out.println("The single numer is " + x);
        return 0;
    }

    



}


public class overload {

    public static void main(String[]args){
        over obj = new over();
        obj.cal (1 ,12 ) ;
        obj.cal( 234.32f , 234.34f);
        obj.cal(2134);
        
    
    }
}