class Main
{
    public static void main(String args[])
    {
        int base = 3; 
        int x = 5;
        System.out.println("Required power is" + power(base , x));
    }
    static int power(int base, int x)
    {
        if(x == 0)
        return 1;
        return (base * power (base, x-1));
    }
}
