package graph;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Breadth First Search using adjaceny matrix
*/
// Vertex class
class Vertex {
	public char label;
	public boolean wasVisited;
	
	public Vertex(char label) {
		this.label = label;
		this.wasVisited = false;
	}
}

public class BreadthFirstSearch {
	
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	private Queue<Integer> queue;
	
	public BreadthFirstSearch() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		queue = new LinkedList<>();
	}
	
	// To add a vertex
	public void addVertex(char label) {
		vertexList[nVerts++] = new Vertex(label);
	}
	
	// To add an edge
	public void addEdge(int row, int col) {
		adjMat[row][col] = 1;
		adjMat[col][row] = 1;
	}
	
	// To display vertex label
	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}
	
	public void bfs() {
		vertexList[0].wasVisited = true;
		displayVertex(0);
		queue.add(0);
		int tempVertex2;
		while(!queue.isEmpty()) {
			int tempVertex1 = queue.remove();
			while((tempVertex2 = getAdjUnvisitedVertex(tempVertex1)) != -1) {
				vertexList[tempVertex2].wasVisited = true;
				displayVertex(tempVertex2);
				queue.add(tempVertex2);
			}
		}
	}
	
	private int getAdjUnvisitedVertex(int v) {
		for(int i=0;i<nVerts;i++) {
			
			if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}

}
