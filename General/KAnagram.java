import java.util.*;
public class KAnagram
{
    public static boolean isanagram(String str, String str1 , int k)
    {
        if(str.length()!=str1.length())
        {
            return false;
        }
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
            int result = 0;
            for(int i=0;i<str.length();i++)
            {
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }
                else
                {
                    map.put(str.charAt(i),1);
                }
            }
            for(int i=0;i<str1.length();i++)
            {
                if(map1.containsKey(str1.charAt(i)))
                {
                    map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
                }
                else
                {
                    map1.put(str1.charAt(i),1);
                }
            }
            int value=0;
            for(Map.Entry<Character,Integer> map2 : map.entrySet())
            {
                if(map1.containsKey(map2.getKey()))
                {
                    value =value + Math.abs(map.get(map2.getKey())-map1.get(map2.getKey()));
                }
            }
            if(value <= k)
            {
                return true;
            }
            return false;
}
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int value = sc.nextInt();
        boolean check = isanagram(str,str1,value);
        if(check==true)
        {
            System.out.println("Yes it's a k anagram");
        }
        else
        {
            System.out.println("Sorry my friend it's not k anagram");
        }
    }
}