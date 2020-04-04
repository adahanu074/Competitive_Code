import java.util.*;
public class IsomorphicString
{
    private static boolean check(String first, String second)
    {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        for(int i=0;i<first.length();i++)
        {
            if(map2.containsKey(first.charAt(i)))
            {
                map2.put(first.charAt(i), map2.get(first.charAt(i))+1);
            }
            else
            {
                map2.put(first.charAt(i),1);
            }
        }
        for(int j=0;j<second.length();j++)
        {
            if(map1.containsKey(second.charAt(j)))
            {
                map1.put(second.charAt(j), map1.get(second.charAt(j))+1);
            }
            else
            {
                map1.put(second.charAt(j),1);
            }
        }
        ArrayList<Map.Entry<Character,Integer>> list1 = new ArrayList<Map.Entry<Character,Integer>>(map1.entrySet());
        ArrayList<Map.Entry<Character,Integer>> list2 = new ArrayList<Map.Entry<Character,Integer>>(map2.entrySet());
        Collections.sort(list1, new Comparator<Map.Entry<Character,Integer>>(){
                public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2)
                {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
        });
        Collections.sort(list2, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
    });
        if(list1.size()!=list2.size())
        {
            return false;
        }
        else
        {
            for(int i=0;i<list1.size();i++)
            {
                if(list1.get(0).getValue()!=list2.get(0).getValue())
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        boolean check = check(first,second);
        System.out.println(check);
    }
}