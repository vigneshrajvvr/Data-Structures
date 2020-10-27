package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearchDisconnected {
	
	// To store graph elements and visited array
	private LinkedList<Integer> adjList[];
	private boolean visited[];
	
	public DepthFirstSearchDisconnected(int size) {
		
		adjList = new LinkedList[size];
		visited = new boolean[size];
		
		for(int i=0;i<size;i++) {
			adjList[i] = new LinkedList<>();
		}
		
	}
	
	// To add an edge
	public void addEdge(int vertex, int edge) {
		adjList[vertex].add(edge);
	}
	
	// Depth First Search traversal
	public void DFS(int vertex, boolean visited[]) {
		
		if(visited[vertex]) {
			return;
		}
		System.out.print(vertex +  " ");
		visited[vertex] = true;
		Iterator<Integer> connections = adjList[vertex].listIterator();
		while(connections.hasNext()) {
			int next = connections.next();
			DFS(next, visited);
		}
		
	}
	
	public void DFS() {
		
		for(int i=0;i<adjList.length;i++) {
			
			if(visited[i] == false) {
				DFS(i, visited);
			}
			
		}
		
	}
	
	// To list all the connections
	public void listConnections() {
		for(int i=0;i<adjList.length;i++) {
			System.out.println(adjList[i]);
		}
	}

}
