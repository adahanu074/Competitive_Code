// import java.util.*;
// class Distance {
//     public static double check(int i , double arr[])
//     {
//         ArrayList<Double> list = new ArrayList<Double>();
//         int j=0;
//         while(i>0)
//         {
//             if((i&1)>0)
//             {
//                 list.add(arr[j]);
//             }
//             i = (i>>1);
//             j++;
//         }
//         if(list.size()==2)
//         {
//             double value =  Math.sin(list.get(0)+list.get(1))*Math.cos(list.get(0)-list.get(1));
//             return value;
//         }
//         return 0;
//     }
//     public static void main(String args[] ) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int value = sc.nextInt();
//         double arr [] =new double[value];
//         for(int i=0;i<value;i++)
//         {
//             arr[i]=sc.nextDouble();
//         }
//         double sum = 0;
//         int range = (1<<value) - 1;
//         for(int i=1;i<=range;i++)
//         {
//                sum = sum + check(i,arr);
//         }
//         System.out.println(sum);
//         System.out.printf("%.2f",sum);
//     }
// }


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class Distance {
    public static int fact(int n)
    {
        if(n<1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static int combo(int  n ,int r)
    {
        int value = fact(n)/(fact(r)*fact(n-r));
        return value;
    }
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int value = sc.nextInt();
       int arr[]= new int[value];
       for(int i=0;i<value;i++)
       {
           arr[i]=sc.nextInt();
       }
       int odd = 0;
       int even = 0;
       for(int i=0;i<value;i++)
       {
           if(arr[i]%2==0)
           {
               even++;
           }
           else
           {
               odd++;
           }
       }
       int result =0;
        for(int i=2;i<=odd;i=i+2)
       {
           int odd1 = combo(odd,i);
           for(int j=1;j<=even;j++)
            {
              int even1 =  combo(even,j);
              result = result + (odd1*even1);
            }
       }
       for(int i=2;i<=odd;i=i+2)
       {
        result = result +  combo(odd,i);
       }
       for(int j=1;j<=even;j++)
            {
                result = result + combo(even,j);
            }
       System.out.println(result);

    }
}
