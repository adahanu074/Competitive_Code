import java.util.*;
public class NumberDistinctPermutation
{
    public static Set<String> set = new HashSet<String>();

    public static void permutation(String str ,int low,int n)
    {
        if(low>n)
        {
            set.add(str);
            return;
        }
        else
        {
        for(int i=low;i<=n;i++)
        {
            char ch[] = str.toCharArray(); 
            char temp = ch[i]; 
            ch[i] = ch[low]; 
            ch[low] = temp;
            String str1=String.valueOf(ch);
            permutation(str1,low+1,n);
            char temp1 = ch[i]; 
            ch[i] = ch[low]; 
            ch[low] = temp1;
            str=String.valueOf(ch);
        }
    }
        System.out.println(set);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutation(str,0,str.length()-1);
    }
}