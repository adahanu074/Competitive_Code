import java.util.*;
public class NumberOfWords
{
    private static int noOfWords(String str)
    {
        str = str.trim();
        String [] arr = str.split("\\s+");
        return arr.length;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = noOfWords(str);
        System.out.println(len);
    }
}