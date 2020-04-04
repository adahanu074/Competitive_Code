import java.util.*;
public class LexiSubSet
{
    public static String generate(String str,int n)
    {
        int j=0;
        String result = "";
        while(n>0)
        {
            if((n&1)>0)
            {
                result = result + String.valueOf(str.charAt(j));
            }
            j++;
            n=(n>>1);
        }
        return result;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int range = (1<<str.length())-1;
        Set<String> set = new TreeSet<String>();
        for(int i=1;i<=range;i++)
        {
            String st = generate(str,i);
            set.add(st);
        }
        System.out.println(set);
    }
}