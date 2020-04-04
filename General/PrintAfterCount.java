public class PrintAfterCount
{
    public static void main(String str, char a , int value)
{
    int count =0;
    int i=0;
    for(i=0;i<str.length();i++)
    {
        if(count==value)
        {
            break;
        }
        if(str.charAt(i)==a)
        {
            count++;
        }
    }
    return str.subString(i,str.length());
}
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        int value = sc.nextInt();
        String result = output(str,a,value);
        System.out.println(result);
    }
}