package chapter8;

public class Maze3D { //PROJECT 8.4
	
   private final int TRIED = 3;
   private final int PATH = 7;

   private int[][][] maze;
   private int[][][] grid;
   
   public boolean recrusiveMaze(int row, int column, int third) {
      grid = new int[maze.length][maze[0].length][maze[0][0].length];
      for(int i = 0; i < maze.length; i++) {
         for(int j = 0; j < maze[i].length; j++) {
            for(int k = 0; k < maze[i][j].length; k++) {
               grid[i][j][k] = maze[i][j][k];
            }
         }
      }
      return traverse(row, column, third);
   }
 
   private boolean traverse(int row, int column, int third)
   {
      boolean done = false;
      
      if(valid(row, column, third))
      {
          grid[row][column][third] = TRIED;

          if(row == grid.length-1 && column == grid[0].length-1 && third == grid[0][0].length-1)
             done = true;
          else
          {
             done = traverse(row+1, column, third);
             if(!done)
                done = traverse(row, column+1, third);
             if(!done)
                done = traverse(row, column, third+1);
             if(!done)
                done = traverse(row-1, column, third);
             if(!done)
                done = traverse(row, column-1, third);
             if(!done)
                done = traverse(row, column, third-1);
          }

          if(done)
          {   
             grid[row][column][third] = PATH;
             System.out.println("[" + row +  "], [" + column + "], [" + third + "]");
          }
       }
       
       return done;
    }
    
    private boolean valid(int row, int column, int third)
    {
       boolean result = false;
  
       if(row >= 0 && row < grid.length &&
           column >= 0 && column < grid[row].length
             && third >= 0 && third < grid[row][column].length)

          if(grid[row][column][third] == 1)
             result = true;

       return result;
    }
 }

