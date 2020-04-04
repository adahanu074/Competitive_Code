public class Permutation
{
    public static String swap(String str, int i, int j)
    {
        char temp; 
        char[] charArray = str.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }
    public static void permutation(String str, int start, int end)
    {
        if(start==end)
        {
            System.out.println(str);
        }
    else
    {
        for(int i=start;i<=end;i++)
        {
            str = swap(str, i, start);
            permutation(str,start+1,end);
            str = swap(str,i,start);
        }
    }
}
    public static void main(String [] args)
    {
        String str  = "abcd";
        permutation(str,0,str.length()-1);
    }
}