import java.util.Scanner;

class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Input 1:");
        int a1 = in.nextInt();
        
        System.out.println("Enter the Input 2:");
        int a2 = in.nextInt();
        
        int sum =0;
        
        for(int i = a1; i <= a2; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of a and b is:" + sum);
    }
}
