class Solution {
    public boolean canFinish(int numCourses, int[][] p) {
        ArrayList[] list=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
            list[i]=new ArrayList();
        boolean[] memory=new boolean[numCourses];
        boolean[] visited=new boolean[numCourses];
        for(int i=0;i<p.length;i++){
            list[p[i][1]].add(p[i][0]);
        }
        for(int i=0;i<numCourses;i++){
            if(!dfs(list,visited,memory,i))
                return false;
        }
        return true;
    }
    public boolean dfs(ArrayList[] list,boolean[] visited,boolean[] memory,int course){
        if(visited[course])
            return false;
        if(memory[course])            
            return true;
        visited[course]=true;
        for(int i=0;i<list[course].size();i++){
            if(!dfs(list,visited,memory,(int)list[course].get(i)))
                return false;
        }
        visited[course]=false;
        memory[course]=true;
        return true;
    }
}