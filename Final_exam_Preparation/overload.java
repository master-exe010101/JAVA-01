class Student{
    int cal(int x ,int y){
        int z;
        z = x+y;
        System.out.println("Result is " +z);
        return 0;
                    
    }
    
    float cal(float num1 , float num2){
        float Mark;
        Mark = num1 + num2;
        System.out.println("Mark is " + Mark);
        return 0;
        
    }
    
    int cal (int x){
        System.out.println(x);
        return 0;
        
        
    }
}

public class over{
    public static void main(String[] args){
        Student obj = new Student();
        obj.cal(10,50);
        obj.cal(10.5f,20.5f);
        obj.cal(40);
        
    }
}