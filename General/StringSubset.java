// import java.util.*;
// public class StringSubset
// {
//     public static int check(String str,int value)
//     {
//         try {
//             int j=0;
//         String result="";
//         while(value>0)
//         {
//             if((value&1)>0)
//             {
//                 result = result + Character.toString(str.charAt(j));
//             }
//             j++;
//             value = (value >>1);
//         }
//         Integer val = Integer.valueOf(result.trim());
//         // System.out.println(result);
//         if((val%2)==0)
//         {
//             return 1;
//         }
//         } catch (Exception e) {
//             //TODO: handle exception
        
//         e.printStackTrace();
//         // return 0;
//     }
// return 0;
//     }
//     public static void main(String [] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int take = sc.nextInt();
//         String str = String.valueOf(take);
//         int len = str.length();
//         int range = (1<<len)-1;
//         int count=0;
//         for(int i=0;i<range;i++)
//         {
//             count = count + (int)(check(str,i));
//         }
//         System.out.println(count);
//     }
// }