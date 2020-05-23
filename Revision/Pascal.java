import java.util.*;
class Pascal
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        // int m = 2*n-1;
        // int arr[][] =new int[n][m];
        // int  start=1;
        // int i=0;
        // int j=0;
        // // for(i=0;i<n;i++)
        // {
        //     StringBuilder str = new StringBuilder()
        //     int flag = 0;
           
        //     // for(j=0;j<m;j++)
        //     // {
        //     //     if((i%2)!=0)
        //     //     {
        //     //         if((j%2)==0)
        //     //         {
        //     //             continue;
        //     //         }
        //     //     }
        //     //     if((i%2)==0)
        //     //     {
        //     //         if((j%2)!=0)
        //     //         {
        //     //             continue;
        //     //         }
        //     //     }
        //     //     if(j>=(n-i-1) && j<=(n+i-1))
        //     //      {
        //     //         arr[i][j]=1;
        //     //     }
        //     // }
        // }

        for (int i = 0; i < rows; i++) 
        { 
            int number = 1; 
            System.out.printf("%" + (rows - i) * 2 + "s", "");
         for (int j = 0; j <= i; j++) 
         { 
             System.out.printf("%4d", number); 
             number = number * (i - j) / (j + 1); 
        } 
          System.out.println();
    }

        //  for( i=0;i<n;i++)
        // {
        //     for(j=0;j<m;j=j+1)
        //     {
        //         System.out.print(arr[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
    }
}