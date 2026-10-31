package Graph;
import java.util.*;
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer>q = new LinkedList<>();
        ArrayList<Integer>ans = new ArrayList<>();
        
        boolean visited[] = new boolean[adj.size()];
        
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            
            int u = q.poll();
            ans.add(u);
            
            for(int v : adj.get(u)){
                
                if(!visited[v]){
                    
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
        
        return ans;
        
       
    }
}
