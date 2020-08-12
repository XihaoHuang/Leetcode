class Solution {
    public int maximalRectangle(char[][] matrix) {
        int area=0;
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                if(matrix[r][c]==49){
                    area=Math.max(area,getarea(matrix,r,c));
                }   
            }
        }
        return area;    
       }
    public int getarea(char[][] m,int r,int c){
        int width=getwidth(m,r,c);
        int rowwidth;
        int height=1;
        int area=width*height;
        while(++r<m.length){
            if(m[r][c]==48) break;
            rowwidth=getwidth(m,r,c);
            height++;
            if(rowwidth<=width)
                width=rowwidth;
            area=(area>width*height)? area:width*height;
        }
        return area;
    }
    public int getwidth(char[][] m,int r,int c){
        int width=1;
         while(++c<m[r].length){
            if(m[r][c]==48) break;
                width++;
        }
        return width;
    }
}