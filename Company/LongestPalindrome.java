class LongestPalindrome
{
    public static void main(String [] args)
    {
        String str  = "agbdba";
        int result[][] = new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++)
        {
            result[i][i]=1;
        }
        int k =0;
        while(k<str.length()-1)
        {
            if(str.charAt(k)==str.charAt(k+1))
            result[k][k+1]=2;
            else
            result[k][k+1]=1;

            k++;
        }
        for(int i=2;i<str.length();i++)
        {
            for(int j=0;j<str.length()-i;j++)
            {
                if(str.charAt(j)==str.charAt(j+i))
                {
                    result[j][j+i]=result[j+1][j+i-1]+2;
                }
                else
                {
                    result[j][j+i] = Math.max(result[j][j+i-1],result[j+1][j+i]);
                }
            }
        }
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();
        }
    }
}