import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int octal = in.nextInt();
        int decimal = 0;
        int n = 0;
        
        while(octal > 0)
        {
            int temp = octal % 10;
            decimal += temp * Math.pow(8,n);
            octal /= 10;
            n++;
        }
        System.out.println(decimal);
    }
}
