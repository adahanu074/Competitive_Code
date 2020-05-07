import java.util.*;
class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        for(int i=0;i<ransomNote.length();i++)
        {
            if(map.containsKey(ransomNote.charAt(i)))
            {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))+1);
            }
            else
            {
                map.put(ransomNote.charAt(i),1);
            }
        }
        for(int i=0;i<magazine.length();i++)
        {
            if(map1.containsKey(magazine.charAt(i)))
            {
                map1.put(magazine.charAt(i),map1.get(magazine.charAt(i))+1);
            }
            else
            {
                map1.put(magazine.charAt(i),1);
            }
        }
        System.out.println(map);
        System.out.println(map1);
        for(Map.Entry<Character,Integer> map3:map.entrySet())
        {
            char key = map3.getKey();
            int value =map3.getValue();
            System.out.println(key);
            if(!map1.containsKey(key))
            {
                System.out.println("map1");
                return false;
            }
            else
            {
                int val = map1.get(key);
                if(value>val)
                {
                    System.out.println("map2");
                    return false;
                }
            }
        }
        return true;  
    }
    public static void main(String [] args)
    {
        // Solution1 sol = new Solution1();
        // System.out.println(sol.canConstruct("aa","aab"));
        char ar[][] = new char[3][3];
        if(ar[0][0]>'a')
        System.out.println(Arrays.toString(ar[0]));
        else{
            System.out.println("Arrays.toString(ar[0])");
        }
    }
}