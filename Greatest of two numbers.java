import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = in.nextInt();
        int b = in.nextInt();
        
        if(a > b)
        {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}
