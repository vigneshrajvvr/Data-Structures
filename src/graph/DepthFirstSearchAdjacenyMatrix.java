package graph;

import java.util.Stack;

public class DepthFirstSearchAdjacenyMatrix {
	
	private int[][] adjacencyMatrix;
	
	private boolean[] visited;
	
	public DepthFirstSearchAdjacenyMatrix(int numberOfVertexes) {
		
		adjacencyMatrix = new int[numberOfVertexes][numberOfVertexes];
		visited = new boolean[numberOfVertexes];
		
	}
	
	// To add edges
	public void addEdge(int v1, int v2) {
		
		adjacencyMatrix[v1][v2] = 1;
		adjacencyMatrix[v2][v1] = 1;
		
	}
	
	// Depth first search in adjacency matrix
	public void dfs(int start) {
		
		if(visited[start]) {
			return;
		}
		visited[start] = true;
		System.out.println(start);
		Stack<Integer> s = new Stack<>();
		s.add(start);
		
		while(!s.isEmpty()) {
			
			int x = s.pop();			
			for(int row =0;row < adjacencyMatrix.length;row++) {
				
				if(adjacencyMatrix[start][row] == 1) {
					dfs(row);
				}
								
			}
			
		}
		
		
	}
	
	// To view adjacency matrix
	public void showMatrix() {
		
		for(int row = 0; row<adjacencyMatrix.length;row++) {
			for(int col = 0; col<adjacencyMatrix[row].length;col++) {
				System.out.print(adjacencyMatrix[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
