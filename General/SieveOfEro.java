import java.util.*;
public class SieveOfEro
{
    public static void sieve(int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<=n;i++)
        {
            list.add(i);
        }
        for(int i=0;i<=Math.sqrt(n);i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j)%list.get(i) == 0)
                {
                    list.remove(list.get(j));
                }
            }
        }
        System.out.println(list);
    } 
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve(n);
    }
}