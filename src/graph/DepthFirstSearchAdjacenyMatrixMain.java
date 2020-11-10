package graph;

public class DepthFirstSearchAdjacenyMatrixMain {
	
	public static void main(String args[]) {
		
		DepthFirstSearchAdjacenyMatrix dfs = new DepthFirstSearchAdjacenyMatrix(4);
		
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 3);
		
		dfs.showMatrix();
		
		dfs.dfs(0);
		
		
	}

}
