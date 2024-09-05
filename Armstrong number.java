class Main
{
    public static void main(String args[])
    {
        int a = 153;
        int temp = a,sum=0;
        int digitCount = countDigits(a);
        
        while(a != 0)
        {
            int digit = a % 10;
            sum += (int)Math.pow(digit,digitCount);
            a = a/10;
        }
        if(sum == temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("not Armstrong number");
        }
    }
    public static int countDigits(int a)
    {
        int count = 0;
        while(a != 0)
        {
            a = a/10;
            count++;
        }
        return count;
    }
}
