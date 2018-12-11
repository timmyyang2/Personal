package chapter8;

public class Maze { //PROJECT 8.3
	
   private final int TRIED = 3;
   private final int PATH = 7;

   private int[][] maze = { {1,1,1,0,1,1,0,0,0,1,1,1,1},
                            {1,0,1,1,1,0,1,1,1,1,0,0,1},
                            {0,0,0,0,1,0,1,0,1,0,1,0,0},
                            {1,1,1,0,1,1,1,0,1,0,1,1,1},
                            {1,0,1,0,0,0,0,1,1,1,0,0,1},
                            {1,0,1,1,1,1,1,1,0,1,1,1,1},
                            {1,0,0,0,0,0,0,0,0,0,0,0,0},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1} };

   private int[][] grid;
 
   public boolean recursiveMaze(int row, int column) {
      grid = new int[maze.length][maze[0].length];
      for(int i = 0; i < maze.length; i++) {
         for(int j = 0; j < maze[i].length; j++) {
            grid[i][j] = maze[i][j];
         }
      }
      return traverse(row, column);
   }
 
   private boolean traverse(int row, int column) {
      boolean done = false;
      
      if(valid(row, column))
      {
         grid[row][column] = TRIED;

         if(row == grid.length-1 && column == grid[0].length-1)
            done = true;
         else
         {
            done = traverse(row+1, column);
            if(!done)
               done = traverse(row, column+1);
            if(!done)
               done = traverse(row-1, column);
            if(!done)
               done = traverse(row, column-1);
         }

         if(done)
         {   
            grid[row][column] = PATH;
            System.out.println("[" + row +  "], [" + column + "]");
         }
      }
      
      return done;
   }

   private boolean valid(int row, int column)
   {
      boolean result = false;
      
      if(row >= 0 && row < grid.length &&
          column >= 0 && column < grid[row].length)

         if(grid[row][column] == 1)
            result = true;

      return result;
   }

   public String toString()
   {
      String result = "\n";

      for(int row=0; row < maze.length; row++)
      {
         for(int column=0; column < maze[row].length; column++)
            result += maze[row][column] + "";
         result += "\n";
      }

      return result;
   }
}

