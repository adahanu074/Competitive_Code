import java.util.*;
class TestClass1 {
    static int mod = 1000000000;
    public static int helper(double x,double y, double zero, double one)
    {
        if(zero==x)
        {
            return 1;
        }if(one==y)
        {
            return 1;
        }
        else
        {
            int resu = 0;
            int left = (helper(x,y,zero+1,one)%mod);
            int right = (helper(x,y,zero,one+1)%mod);
            resu = (resu%mod + left%mod + right%mod)%mod;
            return resu;
        }

    }
    public static void main(String args[] ) throws Exception {
        
            double x= 2;
            double y =3;
            String res = "0";
            double zero = 0;
            double one = 0;
            if(x>y)
            {
                System.out.println("0");
            }
            if(x==0)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println(helper(x,y,zero,one));
            }
    }
}
