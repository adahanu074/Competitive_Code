public class LongestCommonSub
{
    public static void main(String [] args)
    {
        String a = "abcdaf";
        String b = "acbcf";
        int arr[][] = new int[b.length()][a.length()];
        int flag = 0;
        for(int i=0;i<a.length();i++)
        {
            if(flag == 1)
            {
                arr[0][i]=1;
                continue;
            }
            if(b.charAt(0)==a.charAt(i))
            {
                flag =1;
                arr[0][i]=1;
            }
        }
        flag=0;
        for(int i=0;i<b.length();i++)
        {
            if(flag == 1)
            {
                arr[i][0]=1;
                continue;
            }
            if(b.charAt(i)==a.charAt(0))
            {
                flag =1;
                arr[i][0]=1;
            }
        }
        for(int i=1;i<b.length();i++)
        {
            for(int j=1;j<a.length();j++)
            {
                if(b.charAt(i)==a.charAt(j))
                {
                    arr[i][j]= arr[i-1][j-1]+1;
                }
                else
                {
                    arr[i][j]= Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
            System.out.println();
        }
        for(int i=0;i<b.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}