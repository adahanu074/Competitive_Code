class DryRun
{
    public int count =0;
public void foo()
{
    if(count<5)
    {
        count++;
        System.out.println(count);
        foo();
    }
    else
    {
        System.out.println(count);
    }
}
public static void main(String [] args)
{
    
    DryRun dr = new DryRun();
    dr.foo();
    dr.foo();
}
}