class Main
{
    public static void main(String args[])
    {
        int num = 121;
        int rev = 0,rem,temp;
        temp = num;
        
        while(temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(num == rev)
        {
            System.out.println("The original number is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
