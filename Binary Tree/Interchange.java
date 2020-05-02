class InterchangeCheck
{
    public static void interchange(int a, int b)
    {
        System.out.println("2) " +a+"::::::"+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("3) "+ a+"::::::"+b);
    }
    public static void main(String [] args)
    {
        int a =10;
        int b = 20;
        interchange(a,b);
        System.out.println("1) " +a+"::::::"+b);
        interchange(a,b);
        System.out.println("4) " + a+"::::::"+b); 
    }
}