package ipc_camp_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSTrees {
	
	private static List<Integer> nodes[];
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int n = in.nextInt();
		nodes = new ArrayList[n];
			
		for(int i=0;i<n-1;i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			nodes[u].add(v);
			nodes[v].add(u);
		}
		
	}

}
