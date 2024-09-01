import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        int n = 25;
        checkPrime(n);
    }
    private static void checkPrime(int n)
    {
        int count = 0;
    
        if(n < 2)
        {
            System.out.println("The given number is not a prime number");
            System.exit(0);
        }
        for(int i = 1 ; i <= n; i++)
        {
            if(n % i == 0)
            count += 1;
        }
            if(count > 2)
                System.out.println("not a prime number");
            else
                System.out.println("is prime number");
        
   }
        
}
   
