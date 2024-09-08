class Main{
    public static void main(String args[])
    {
        char ch='9';
        if((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + "Is an alphabet");
        }
        else{
            System.out.println("Is not an alphabet");
        }
    }
}
