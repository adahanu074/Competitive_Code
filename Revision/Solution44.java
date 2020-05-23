import java.util.*;
class Solution44 {
    public static boolean ispermutation(Map<Character,Integer> map1 ,Map<Character,Integer> map)
    {
        if(map.size()!=map1.size())
        {
            return false;
        }
        System.out.println(map1);
        System.out.println(map);
        for(Map.Entry<Character,Integer> map2:map1.entrySet())
        {
            char key = map2.getKey();
            int value = map2.getValue();
            if(map.containsKey(key))
            {
                int val = map.get(key);
                if(val!=value)
                {
                    System.out.println("nooooooo");
                    return false;
                }
            }
            else
            {
                 System.out.println("yessss");
                return false;
            }
            
        }
        System.out.println("heheheheeheh");
        return true;
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length() || s1.length()==0 || s2.length()==0)
        {
            return false;
        }
        else
        {
            
            Map<Character,Integer> map = new HashMap<>();
            Map<Character,Integer> map1 = new HashMap<>();            
            
            for(int i=0;i<s1.length();i++)
            {
                if(map1.containsKey(s1.charAt(i)))
                {
                    map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
                }
                else
                {
                    map1.put(s1.charAt(i),1);
                }
            }
            // for(int i=0i<s2.length();i++)
            // {
            //     if(map.containsKey(s2.charAt(i)))
            //     {
            //         map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
            //     }
            //     else
            //     {
            //         map.put(s2.charAt(i),1);
            //     }
            // }
            int start=0;
            for(int i=0;i<s2.length();i++)
            {
                if(i>=s1.length())
                {
                    boolean val = ispermutation(map1,map);
                    if(val==true)
                    {
                        return true;
                    }
                    char va = s2.charAt(start);
                    if(map.containsKey(va))
                    {
                        int valu = map.get(va);
                        if(valu==1)
                        {
                            map.remove(va);
                        }
                        else
                        {
                            map.put(va,valu-1);
                        }
                    }
                     
                    if(map.containsKey(s2.charAt(i)))
                    {
                        map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
                    }
                    else
                    {
                        map.put(s2.charAt(i),1);
                    }
                    start++;
                }
                else
                {
                 if(map.containsKey(s2.charAt(i)))
                    {
                        map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
                    }
                else
                    {
                    map.put(s2.charAt(i),1);
                    }
                }
            }
             boolean val = ispermutation(map1,map);
            if(val==true)
            {
                return true;
            }
            return false;
            }
        }
        public static void main(String args[])
        {
            String str = "ab";
            String str1 = "eidboaoo";
            System.out.println(checkInclusion(str,str1));
        }
    }