import java.util.*;
public class Permutation 
{
    private static void permute(String a,int start,int end)
    {
        if(start==end)
        {
            System.out.println(a);
        }
        else
        {
        for(int i=start;i<=end;i++)
        {
        char ch[] = a.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[start]; 
        ch[start] = temp; 
        a = String.valueOf(ch);
            permute(a,start+1,end);
            char ch1[] = a.toCharArray(); 
        char temp1 = ch1[i]; 
        ch1[i] = ch1[start]; 
        ch1[start] = temp1; 
        a = String.valueOf(ch1);
        }
    }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        permute(first,0,first.length()-1);
    }
}