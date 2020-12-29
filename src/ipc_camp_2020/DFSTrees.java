package ipc_camp_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSTrees {
	private static List<Integer> nodes[];
	private static boolean[] visited;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int n = in.nextInt();
		nodes = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=0;i<nodes.length;i++) {
			nodes[i] = new ArrayList<>();
		}
		
		System.out.println("Enter the edges : ");
		for(int i=0;i<n-1;i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			nodes[u].add(v);
			nodes[v].add(u);
		}
		
		dfs();
		
	}
	
	public static void dfs() {
		dfs(1,1);
	}
	
//	public static void dfs(int startNode) {
//		if(visited[startNode]) {
//			return;
//		}
//		System.out.println(startNode);
//		visited[startNode] = true;
//		List<Integer> tempList = nodes[startNode];
//		for(int i=0;i<tempList.size();i++) {
//			dfs(tempList.get(i));
//		}
//	}
	
	// Just traversal of tree, depth wise
	public static void dfs(int startNode, int parentNode) {
		System.out.println(startNode);
		List<Integer> tempList = nodes[startNode];
		for(int i : tempList) {
			if(i == parentNode) {
				continue;
			}
			dfs(i, startNode);
		}
	}
}
