import java.util.*;
class Adarsh implements Comparable<Adarsh>
{
    String str;
    Adarsh(String str)
    {
        this.str=str;
    }
    public int compareTo(Adarsh s1)
    {
       return  (this.str).compareTo(s1.str);
    }
}
public class Whole
{
    
    public static void main(String [] args)
    {
        // // ArrayList<String> list =new ArrayList<>();
        // HashMap<Character,Integer> map = new HashMap<>();
        // String str = "aacqaczbnm";
        // for(int i=0;i<str.length();i++)
        // {
        //     if(map.containsKey(str.charAt(i)))
        //     {
        //         map.put(str.charAt(i),map.get(str.charAt(i))+1);
        //     }
        //     else
        //     {
        //         map.put(str.charAt(i),1);
        //     }
        // }
        // // int n = map.entrySet();
        // // System.out.println(map.entrySet());
        // Set<Map.Entry<Character,Integer>> set = map.entrySet();
        // // System.out.println(set);
        // ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(set);
        // // System.out.println(list);
        // Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
        //     public int compare(Map.Entry<Character,Integer> map1,Map.Entry<Character,Integer> map2)
        //     {
        //         return (map1.getValue()).compareTo(map2.getValue());
        //     }
        // });
        PriorityQueue<String> list1 = new PriorityQueue<>();
        // Adarsh a = new Adarsh("hello");
        // Adarsh b = new Adarsh("mello");
        // Adarsh c = new Adarsh("adarsh");
        // list1.add(a);
        // list1.add(b);
        // list1.add(c);
        list1.add("ADADAD");
        list1.add("qeweww");
        list1.add("323323");
        // Collections.sort(list1)
        // ArrayList<Character> list = new ArrayList<>();
        // for(char c : map.keySet())
        // {
        //     list.add(c);
        // }
        // Collections.sort(list);
        // System.out.println(list1.get);
        for ( String z:list1)
        {
            // System.out.println(z.str);
            System.out.println(z);
        }
        // for(char c:list)
        // {
        //     System.out.println(map.get(c));
        // }
        // list.add("hello");
        // list.add("mello");
        // list.add("adarsh");
        // Collections.sort(list,new Comparator<String>(){
        //     public int compare(String o1 , String o2)
        //     {
        //         return o2.compareTo(o1);
        //     }
        // });
        // System.out.println(list);
    }
}