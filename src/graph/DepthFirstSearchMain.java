package graph;

public class DepthFirstSearchMain {
	
	public static void main(String args[]) {
		
		DepthFirstSearch dfs = new DepthFirstSearch(4);
		
		dfs.addEdge(0, 1); 
        dfs.addEdge(0, 2); 
        dfs.addEdge(1, 2); 
        dfs.addEdge(2, 0); 
        dfs.addEdge(2, 3); 
        dfs.addEdge(3, 3);
        
        dfs.listConnections();
        
        System.out.println("Depth First search");
        dfs.DFS(2);
		
	}

}
