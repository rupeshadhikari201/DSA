import java.util.ArrayList;
import java.util.HashSet;

class MPair{
    int start;
    int end;
    public MPair(int start, int end){
        this.start = start; 
        this.end = end;
    }
    @Override
    public String toString() {
        return "(" + start + "," + end + ")";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MPair myPair = (MPair) o;
        return start == myPair.start && end == myPair.end;
    }

    @Override
    public int hashCode() {
        return 31 * start + end;
    }
    
}
public class NoOfDistinctIsland {
    public static void main(String[] args) {
        // output: 3
        int grid[][] = {{1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1}};
        NoOfDistinctIsland ndl = new NoOfDistinctIsland();
        ndl.distinctIsland(grid);
    }

    public void distinctIsland(int[][] grid){
        HashSet<ArrayList<MPair>> hs = new HashSet<>();
        int row = grid.length;
        int col = grid[0].length;
        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};
        boolean visited[][] = new boolean[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    ArrayList<MPair> al = new ArrayList<>();
                    dfs(i, j, i, j, grid, visited, delrow, delcol, al);
                    hs.add(al);
                }
            }
        }
        System.out.println(hs);
        System.out.println("Number of distinct islands: " + hs.size());
    }
    public void dfs(int row, int col,int baseRow, int baseCol, int[][] grid, boolean visited[][], int delrow[],  int delcol[], ArrayList<MPair> island){
        visited[row][col] = true;
        island.add(new MPair(row - baseRow, col - baseCol));

        // go all four direction
        for(int i=0; i<4; i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];

            //check bound
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length){
                if(!visited[nrow][ncol] && grid[nrow][ncol]==1){
                    dfs(nrow,ncol, baseRow, baseCol,grid, visited, delrow, delcol, island);
                }
            }
        }
    }
}
