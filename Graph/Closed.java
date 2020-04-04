import java.util.*;
public class Closed
{
// public boolean issafe(char arr[][], int i, int j, int n,int m)
//     {
//         if(i<0 || i>=n || j<0 || j>=m)
//         {
//             return false;
//         }
//         if(arr[i][j]=='X')
//         {
//             return true;
//         }
//         else
//         {
//          return issafe(arr,i,j-1,n,m) && issafe(arr,i-1,j,n,m) && issafe(arr,i,j+1,n,m) &&
//             issafe(arr,i+1,j,n,m);
//         }
//     }
//     public void solve(ArrayList<ArrayList<Character>> a) {
//         int n = a.size();
//         int m = a.get(0).size();
//         char [][] arr = new char[n][m];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 arr[i][j]= a.get(i).get(j);
//             }
//         }
//         for(int i=1;i<n;i++)
//         {
//             for(int j=1;j<m;j++)
//             {
//                 if(arr[i][j]=='O')
//                 {
//                     if(issafe(arr,i,j,n,m)==true)
//                     {
//                         arr[i][j]='1';
//                     }
//                 }
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(arr[i][j]=='1')
//                 {
//                     arr[i][j]='X';
//                 }
//             }
//         }
//         a.clear();
//         for(int i=0;i<n;i++)
//         {
//             ArrayList<Character> list = new ArrayList<Character>();
//             for(int j=0;j<m;j++)
//             {
//                 list.add(arr[i][j]);
//             }
//             a.add(list);
//         }
        
//     }
// }
        public static void main(String [] args)
        {
            String b ="A man, a plan, a canal: Panama";
            b= b.toLowerCase();
            b = b.trim();
            String result = "";
            for(int i=0;i<b.length();i++)
            {
                // if((b.charAt(i)>='0' && b.charAt(i)<=9) || (b.charAt(i)>='a' || b.charAt(i)<='z'))
                // {
                //     result=result+String.valueOf(b.charAt(i));
                // }
                if(Character.isLetterOrDigit(b.charAt(i)))
                {
                    result=result+String.valueOf(b.charAt(i));
                }
                else
                {
                    continue;
                }
            }
            System.out.println(result);
            StringBuilder str = new StringBuilder(result);
            String hel = str.reverse().toString();
            System.out.println(hel);
            System.out.println(hel.substring(0,0));
        // if(rev.equals(str.toString()))
        // {
        //     return 1;
        // }
        // return 0;
            

        }
}