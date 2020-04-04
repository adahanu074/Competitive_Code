class RatInAMaze
{
    public boolean solveMaze(int arr[][],int i,int j)
    {
        if(i<0 || j>=arr.length || i>=arr.length || j<0){
            return false;
        }
        else if(arr[i][j]==0)
        {
            return false;
        }
        else if(i==arr.length-1 && j==arr.length-1)
        {
            return true;
        }
        else
        {
            return solveMaze(arr,i,j+1) || solveMaze(arr,i+1,j);
        }
    }
    public static void main(String args[]) 
    { 
        RatInAMaze rat = new RatInAMaze(); 
        int maze[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } }; 
  
        int N = maze.length; 
        System.out.println(rat.solveMaze(maze,0,0)); 
    } 
}