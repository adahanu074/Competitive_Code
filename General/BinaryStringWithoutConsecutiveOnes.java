import java.util.*;
public class BinaryStringWithoutConsecutiveOnes
{
    public static int noConsecutiveOnes(int step)
    {
        if(step <= 0)
        {
            return 0;
        }
        else if(step==1)
        {
            return 2;
        }
        else if (step == 2)
        {
            return 3;
        }
        else{
            return noConsecutiveOnes(step-1)+noConsecutiveOnes(step-2);
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = noConsecutiveOnes(n);
        System.out.println(value);
    }
}