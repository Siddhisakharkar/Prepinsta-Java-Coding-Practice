import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = in.nextInt();
        
        if(year % 400 == 0)
        {
            System.out.println("This is leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0 )
        {
            System.out.println("This is also a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }
    }
}
