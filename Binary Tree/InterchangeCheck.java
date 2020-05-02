class InterchangeCheck
{
    public static void interchange(int a[], int b)
    {
        System.out.println("2) " +a[b]+"::::::"+b);
        a[b]=500;
        System.out.println("3) "+ a[b]+"::::::"+b);
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println("1) " +arr[2]+"::::::");
        interchange(arr,2);
        System.out.println("4) " + arr[2]+"::::::"); 
    }
}