package graph;

import java.util.Stack;

public class DepthFirstSearchAdjacenyMatrix {
	
	private int[][] adjacenyMatrix;
	
	private boolean[] visited;
	
	public DepthFirstSearchAdjacenyMatrix(int numberOfVertexes) {
		
		adjacenyMatrix = new int[numberOfVertexes][numberOfVertexes];
		visited = new boolean[numberOfVertexes];
		
	}
	
	// To add edges
	public void addEdge(int v1, int v2) {
		
		adjacenyMatrix[v1][v2] = 1;
		adjacenyMatrix[v2][v1] = 1;
		
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
			for(int row =0;row < adjacenyMatrix.length;row++) {
				
				if(adjacenyMatrix[start][row] == 1) {
					dfs(row);
				}
								
			}
			
		}
		
		
	}
	
	// To view adjaceny matrix
	public void showMatrix() {
		
		for(int row = 0; row<adjacenyMatrix.length;row++) {
			for(int col = 0; col<adjacenyMatrix[row].length;col++) {
				System.out.print(adjacenyMatrix[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
