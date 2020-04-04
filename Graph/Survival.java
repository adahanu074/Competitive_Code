class Survival 
{
    public static int max =0;
    public static boolean survive(int A,int B,int move,int flag)
    {
        System.out.print(A+"  "+B +"\n");
        if(A<=0 || B<=0)
        {
            if(move>max)
            {
                max=move;
            }
            return false;
        }
        else
        {
            if(flag==1)
            {
            return survive(A-5,B-10,move+1,2) || survive(A-20,B+5,move+1,3);
            }
            else if(flag==2)
            {
                return survive(A+3,B+2,move+1,1) || survive(A-20,B+5,move+1,3);
            }
            else{
                 return survive(A+3,B+2,move+1,1) || survive(A-5,B-10,move+1,2);
            }
            // survive(A+3,B+2,move+1);
            // survive(A-5,B-10,move+1);
            // }
            // survive(A-20,B+5,move+1);
        }
    }
    public static void main(String args[])
    {
        int A=23;
        int B=10;
        survive(A,B,0,1);
        System.out.println(max);
    }
}