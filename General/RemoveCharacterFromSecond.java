import java.util.*;
public class RemoveCharacterFromSecond
{
    private static void removedCharacter(String first, String second){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<first.length();i++)
        {
            if(map.containsKey(first.charAt(i)))
            {
                map.put(first.charAt(i),map.get(first.charAt(i))+1);
            }
            else
            {
                map.put(first.charAt(i),1);
            }
        }
        String result = "";
        for(int i=0;i<second.length();i++)
        {
            if(map.containsKey(second.charAt(i)))
            {
                continue;
            }
            else
            {
                result=result+Character.toString(second.charAt(i));
            }
        }
        System.out.println(result);
    } 
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        removedCharacter(first,second);
    }
}