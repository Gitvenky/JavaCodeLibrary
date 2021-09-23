package Graph;

import java.util.ArrayList;

public class Graph {
	ArrayList<ArrayList<Integer>> adj;

	public Graph(int n) {
		this.adj = new ArrayList<ArrayList<Integer>>(n);
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<Integer>());
	}

	void addEdge(int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);

	}

	void displayGraph() {

		for (int i = 0; i < adj.size(); i++) {
			System.out.println(i + " connected to ");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.println(adj.get(i).get(j));
			}
			System.out.println();

		}

	}
}
