class PaintingFence
{
    public static void main(String [] args)
    {
        int dp[] = new int[4];
        int same =0;
        int k=2;
        int diff = k;
        dp[1]=k;
        int mod = 1000000007;
        for(int i=2;i<4;i++)
        {
            same = diff;
            diff = (dp[i-1]*(k-1))%mod;
            dp[i]=(same+diff)%mod;
        }
        System.out.println(dp[3]);
    }
}