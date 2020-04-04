import java.util.*;
public class CommonCharacterInTwoString
{
    private static void commonCharInTwoString(String ab , String ba)
    {
        char [] first = ab.toCharArray();
        char [] second = ba.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        String a = String.valueOf(first);
        String b = String.valueOf(second);
        int i=0;
        int j=0;
        ArrayList<Character> list = new ArrayList<Character>();
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            {
                list.add(a.charAt(i));
                i++;
                j++;
            }
            else if(a.charAt(i)<b.charAt(j))
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        commonCharInTwoString(a,b);
    }
}