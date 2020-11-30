package graph;

public class BreadthFirstSearchMain {
	
	public static void main(String args[]) {
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.addVertex('A');
		bfs.addVertex('B');
		bfs.addVertex('C');
		bfs.addVertex('D');
		bfs.addVertex('E');
		bfs.addVertex('F');
		
		bfs.addEdge(0, 1);
	    bfs.addEdge(1, 2);
	    bfs.addEdge(0, 3);
	    bfs.addEdge(3, 4);
	    bfs.addEdge(4, 5);
	    bfs.addEdge(1, 3);
	    
	    System.out.println("DFS Visits : ");
	    bfs.bfs();
	}

}
