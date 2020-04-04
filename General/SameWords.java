import java.util.*;
public class SameWords
{
    public static String getKey(String str)
    {
        HashMap<Character,Integer> map =new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                continue;
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        String result = "";
        for(Map.Entry<Character,Integer> map1 : map.entrySet())
        {
            result =result +String.valueOf(map1.getKey());
        }
        char are [] =result.toCharArray();
        Arrays.sort(are);
        String b = new String(are);
        return b;
    }
    // public static  group(String [] words)
    // {
        

    // }
    public static void main(String [] args)
    {
        String words[] ={ "may", "student", "students", "dog",
        "studentssess", "god", "cat", "act",
        "tab", "bat", "flow", "wolf", "lambs",
        "amy", "yam", "balms", "looped", 
        "poodle"};
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(int i=0;i<words.length;i++)
        {
            String str = getKey(words[i]);
            if(map.containsKey(str))
            {
                map.get(str).add(words[i]);
            }
            else
            {
                ArrayList<String> list =new ArrayList<String>();
                list.add(words[i]);
                map.put(str, list);
            }
        }
        for(Map.Entry<String,ArrayList<String>> map2 : map.entrySet())
        {
            System.out.println(map2.getValue());
        }
    }
}