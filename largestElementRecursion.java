class Main
{
    static int arr[] = {10, 52,36,42,54,68};
    static int largest()
    {
        int i;
        int max = arr[0];
        for(i = 1; i < arr.length; i++)
        if(arr[i] > max)
        max = arr[i];
        return max;
        
    }
    public static void main(String args[])
    {
        int arr[] = {10, 52,36,42,54,68};
        int max = arr[0];
        System.out.println(largest());
    }
}
