import java.util.*;
public class DuplicatesWords
{
    public static void removeDup(String str)
    {
        String arr [] = str.split(" ");
        Set<String> set = new HashSet<String>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        Iterator iter = set.iterator();
        while(iter.hasNext())
        {
            System.out.print((String)(iter.next())+" ");
        }
    }
    public static void main(String [] args)
    { 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeDup(str);

    }
}