import java.util.*;
public class MaxOccuringChar
{
    private static void maxChar(String str)
    {
        HashMap<Character,Integer>  map = new HashMap<Character,Integer>();
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
      ArrayList<Map.Entry<Character,Integer>> set = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(set, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
     System.out.println(set.get(0).getKey());
    }
    public static void main(String [] args)
    {
        Scanner sc  =new Scanner(System.in);
        String str = sc.nextLine();
        maxChar(str);
    } 
}