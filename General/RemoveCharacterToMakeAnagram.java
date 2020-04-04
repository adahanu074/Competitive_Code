import java.util.*;
public class RemoveCharacterToMakeAnagram
{
    private static void anagram(String a , String b)
    {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        for(int i=0;i<a.length();i++)
        {
            if(map.containsKey(a.charAt(i)))
            {
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            }
            else
            {
                map.put(a.charAt(i),1);
            }
        }
        for(int i=0;i<b.length();i++)
        {
            if(map1.containsKey(b.charAt(i)))
            {
            map1.put(b.charAt(i),map.get(b.charAt(i))+1);
            }
            else
            {
                map1.put(b.charAt(i),1);
            }
        }
        int count = 0;
        if(a.length()==b.length())
        {
            if ((map.entrySet()).containsAll(map1.entrySet()))
            {
                System.out.println("0");
            }
        }
        else if (a.length()>b.length())
        {
            if((map.keySet()).containsAll(map1.keySet()))
            {
                System.out.println(a.length()-b.length());
            }
            else
            {
                System.out.println("Not possible");
            }
        }
        else{
            if((map1.keySet()).containsAll(map.keySet()))
            {
                System.out.println(b.length()-a.length());
            }
            else
            {
                System.out.println("Not possible");
            }
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        anagram(a,b);
    }
}