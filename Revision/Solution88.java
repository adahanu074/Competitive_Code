import java.util.*;
import java.math.*;
class Solution88 {
    public static String customSortString(String S, String T) {
        Map<Character,Integer> map =new HashMap<>();
        int len = S.length();
        if(len==0 || T.length()==0)
        {
            return T;
        }
        for(int i=0;i<len;i++)
        {
            map.put(S.charAt(i),i);
        }
        System.out.println(map);
        List<Character> list =new ArrayList<>();
        for(int i=0;i<T.length();i++)
        {
            // char c = T.charAt(i);
            list.add(T.charAt(i));
        }
        System.out.println(list);
        Collections.sort(list,new Comparator<Character>(){
           public int compare(Character a,Character b)
           {
               int start = 1000;
               int end = 1000;
               if(map.containsKey(a))
               {
                   end = map.get(a);
               }
               if(map.containsKey(b))
               {
                   start=map.get(b);
               }
               if(end<start)
               {
                   return -1;
               }
               return 1;
           }
        });
        System.out.println(list);
        String result = "";
        for(int i=0;i<list.size();i++)
        {
            char val = list.get(i);
            result = result+Character.toString(val);
        }
        return result;
    }
    public static void main(String[] args)
    {
        // String S ="hucw";
        // String T = "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh";
        // String str = customSortString(S,T);
        // System.out.println(str);
        BigInteger b = new BigInteger("100");
        BigInteger c =new BigInteger("3");
        System.out.println(b.mod(c));
    }
}