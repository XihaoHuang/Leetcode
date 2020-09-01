class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                   area=Math.max(area,findarea(r,c,grid)); 
                }
            }
        }
        return area;
    }
    public int findarea(int r,int c,int[][] grid){
        if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==1){
            grid[r][c]=0;
            return 1+findarea(r,c+1,grid)+findarea(r+1,c,grid)+findarea(r,c-1,grid)+findarea(r-1,c,grid);
        }
        return 0;
    }
}