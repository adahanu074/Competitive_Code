public class ComputeLPA
{
    public static void main(String [] args)
    {
        String pat = "acbacdabcy";
        int [] lps  = new int[10];
        int len=0;
        int j=1;
        lps[0]=0;
        System.out.println("Hello");
        while(j<pat.length())
        {
            if(pat.charAt(len)==pat.charAt(j))
            {
                len++;
                lps[j]=len;
                j++;
            }
            else
            {
                if(len!=0)
                {
                    len = lps[len-1];
                }
                else{
                    lps[j]=len;
                    j++;
                }
            }
        }
        for(int i=0;i<pat.length();i++)
        {
            System.out.print(lps[i]+"  ");
        }
    }
}