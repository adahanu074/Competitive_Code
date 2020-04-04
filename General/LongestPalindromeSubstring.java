import java.util.*;
public class LongestPalindromeSubstring
{
    private static boolean[][] checkLongest(String str)
    {
        char [] vert = str.toCharArray();
        char [] hori = str.toCharArray();
        boolean [][] maze = new boolean[str.length()][str.length()];
        for(int i=0;i<str.length();i++)
        {
            maze[i][i] = true;
        }
        for(int j=0;j<str.length()-1;j++)
        {
            if(str.charAt(j)==str.charAt(j+1))
            {
                maze[j][j+1]=true;
            }
            else
            {
                maze[j][j+1]=false;
            }
        }

        for(int i=2;i<str.length();i++)
        {
            for(int j=0;j<str.length()-i;j++)
            {
                if(str.charAt(j) ==str.charAt(j+i))
                {
                    if(maze[j+1][i-1]==true)
                    {
                    maze[j][j+i]= true;
                    }
                    else
                    {
                        maze[j][j+i]= false;
                    }
                }
                else{
                    maze[j][j+i]=false;
                }
            }
        }
        return maze;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean [][] result = checkLongest(str);
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}