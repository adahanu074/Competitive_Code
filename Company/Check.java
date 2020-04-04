class StaticCheck
{
    public static int val = 6;
    public static void prin()
    {
        System.out.println(val);
    }
}
public class Check{
    public static void main(String[] args)
    {
        StaticCheck c = new StaticCheck();
        StaticCheck d = new StaticCheck();
        c.prin();
        d.prin();
    }
}