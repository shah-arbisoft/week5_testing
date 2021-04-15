public class assignment2 {
    public static void main(String[] args) {
        
        
        int n = 10000;


        Runnable even =()->
        {
            int even_count=0;
            for (int i = 1; i < n; i++) 
            {
                if ( i%2 ==0 )
                     even_count++;
            }
            System.out.println("\nTotal even numbers :"+even_count);
        };



        Runnable prime =()->
        {
            int prime_count=0;
            boolean is_prime;
            for (int i = 1; i <= n; i++) 
            { 
                is_prime=true;
                if ( i > 1 )
                    for (int j = 2; j <= i/2; j++) 
                    {
                        if (i%j==0)
                        is_prime=false;
                    }
                
                else
                    is_prime=false;
                
                if (is_prime==true)
                
                    prime_count++;
            }

            System.out.println("Total prime numbers :"+prime_count);
        };

        

        new Thread(even).start();
        new Thread(prime).start();

        
    }
    
}
