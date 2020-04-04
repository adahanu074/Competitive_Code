import java.io.*;
import java.util.*;


public class TestClass1 {
    public static void main(String[] args) throws IOException {
        String str = "bdacdaba";
        String str2 = "ababd";
        int val = Maximum(str,str2);
        System.out.println(val);
    }
    static int Maximum(String S, String T){
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
            if(S.length()==0 || T.length()==0)
            {
                return 0;
            }
            if(T.length()>=S.length())
            {
            for(int i=0;i<S.length();i++)
            {
                if(map.containsKey(S.charAt(i)))
                {
                    map.put(S.charAt(i), map.get(S.charAt(i))+1);
                }
                else
                {
                    map.put(S.charAt(i),1);
                }
            }

            for(int i=0;i< T.length();i++)
            {
                if(map1.containsKey(T.charAt(i)))
                {
                    map1.put(T.charAt(i), map.get(T.charAt(i))+1);
                }
                else
                {
                    map1.put(T.charAt(i),1);
                }
            }
            int total = 0;
            for(Map.Entry map2:map1.entrySet())
            {
                if(map.containsKey(map2.getKey()))
                {
                    int va  = (int)(map2.getValue());
                    total= total+Math.min(va,map.get(map2.getKey()));
                }
            }
            return total;
            }
            else{
                for(int i=0;i<T.length();i++)
            {
                if(map.containsKey(S.charAt(i)))
                {
                    map.put(S.charAt(i), map.get(S.charAt(i))+1);
                }
                else
                {
                    map.put(S.charAt(i),1);
                }
            }

            for(int i=0;i< T.length();i++)
            {
                if(map1.containsKey(T.charAt(i)))
                {
                    map1.put(T.charAt(i), map.get(T.charAt(i))+1);
                }
                else
                {
                    map1.put(T.charAt(i),1);
                }
            }
            System.out.println(map);
            System.out.println(map1);
            int total = 0;
            for(Map.Entry map2:map1.entrySet())
            {
                if(map.containsKey(map2.getKey()))
                {
                    int va  = (int)(map2.getValue());
                    total= total+Math.min(va,map.get(map2.getKey()));
                }
            }
            return total;

            }
    }
}