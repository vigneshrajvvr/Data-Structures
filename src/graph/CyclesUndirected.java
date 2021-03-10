package graph;

import java.util.ArrayList;
import java.util.List;

public class CyclesUndirected {
	
	public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[] = new boolean[V];
        for(int i=0;i< V;i++) {
            if(!visited[i]) {
                if(isCycleUtil(visited, adj, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean isCycleUtil(boolean[] visited, ArrayList<ArrayList<Integer>> adj, int vertex, int parent){
        visited[vertex] = true;
        ArrayList<Integer> temp = adj.get(vertex);
        for(int i: temp) {
            if(!visited[i]) {
                if(isCycleUtil(visited, adj, i, parent)){
                    return true;
                }
            } else if(i != parent || i == vertex){
                return false;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
    	ArrayList<Integer> a1 = new ArrayList<>();
    	a1.add(4);
    	a1.add(2);
    	
    	ArrayList<Integer> a2 = new ArrayList<>();
    	a2.add(1);
    	a2.add(2);

    	ArrayList<Integer> a3 = new ArrayList<>();
    	a3.add(2);
    	a3.add(3);
    	
    	ArrayList<Integer> a4 = new ArrayList<>();
    	ArrayList<Integer> a5 = new ArrayList<>();
    	
    	ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    	adj.add(a1);
    	adj.add(a2);
    	adj.add(a3);
    	adj.add(a4);
    	adj.add(a5);
    	
    	System.out.println(isCycle(5, adj));
    }
	
}
