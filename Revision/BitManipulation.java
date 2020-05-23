import java.util.*;
class BitManipulation
{
    
    public static void main(String args[])  
    { 
        int x = 18;
        int y = -18;
        int z = x-1;
        int a = 10;
        int b = 9;
        String s = Integer.toBinaryString(x);
        String st = Integer.toBinaryString(y);
        String str = Integer.toBinaryString(z);
        String str1 = Integer.toBinaryString(x&y);
        // System.out.println(10/9);
        // System.out.println((10)&(~9));
        // System.out.println(s);
        // System.out.println(st);
        // // System.out.println(str);
        // System.out.println(str1);
        System.out.println(-2/2);
        double m =Math.abs((double)(1)/(double)(3));
        double n =Math.abs((double)(3)/(double)(10));
        if(m==n)
        {
            System.out.println("yesss"); 
        }
        else
        System.out.println("noooo");
    } 
}