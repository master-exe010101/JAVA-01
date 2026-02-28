public class primenum25 {
    public static void main(String args[]) {
        
        System.out.println("Prime numbers from 1 to 100 are: ");

        for (int i = 2; i <= 100; i++) {
            
            int prime = 1; 
            

            
            for (int loop = 2; loop <= i; loop++) {
                
                
                if ((i % loop) == 0 && loop != i) {
                    prime = 0; 
                }
            }

            
            if (prime != 0) {
                System.out.print(i + " ");

                
            }
        }
    }
}



