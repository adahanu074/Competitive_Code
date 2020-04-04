import java.util.*;
import org.apache.commons.lang3.StringUtils;
public class MobileSequence
{
    public static String getNumber(String str, HashMap<String,String> map)
    {
        String result ="";
        for(int i=0;i<str.length();i++)
        {
            for(Map.Entry<String , String> map1 : map.entrySet())
            {
                String st = map1.getKey();
                if(st.contains(str.charAt(i)))
                {
                    int val = st.indexOf(str.charAt(i))+1;
                    result = result + StringUtils.repeat(map1.getValue(),val);
                }
            }
        } 
    return result;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","1");
        map.put("ABC","2");
        map.put("DEF","3");
        map.put("GHI","4");
        map.put("JKL","5");
        map.put("MNO","6");
        map.put("PQRS","7");
        map.put("TUV","8");
        map.put("WXYZ","9");
        map.put("*","*");
        map.put("0","0");
        map.put("#","#");
        String result = getNumber(str,map);
        System.out.println(result);
    }
}