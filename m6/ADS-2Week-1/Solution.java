import java.util.Scanner;
/**
 * Class for page rank.
 */
class PageRank {
	double[] pageRank;
	Digraph graph;
	double[] previousRank;
	PageRank(Digraph g) {
		graph = g;
		int vertices = graph.V();
		pageRank = new double[vertices];
		previousRank = new double[vertices];
		for (int i = 0; i < vertices; i++) {
			pageRank[i] = (double)1 / vertices;
		}

	}
	public double getPR(int vertex) {
		double sum = 0;
		for (int k : graph.adj(vertex)) {
			if (graph.outdegree(k) == 0) {
				return 0;
			} else {
				sum += (previousRank[j] / graph.outdegree(k));
			}
		}
		pageRank[vertex] = sum;
		return pageRank[vertex];

	}
	public void add() {
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < graph.V(); j++) {
				previousRank[j] = pageRank[j];
				pageRank[j] = getPR(j);
				if(previousRank[j] == pageRank[j]){
					break;
				}
			}
		}
	}
	public String toString() {
		String str = "";
		for (int i = 0; i < graph.V(); i++) {
			str += i + " - " + pageRank[i] + "\n";
		}
		return str;
	}

}

class WebSearch {
	int id = 0;
	String words;
	private LinearProbingHashST<String, ArrayList<Integer>> st;
    In in = new In("WebSearch.txt");
    String[] line = in.readString().split(",");
    String[] words = line[1].split(" ");

	

}


public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vertices = Integer.parseInt(scan.nextLine());
		Digraph graph = new Digraph(vertices);
		for (int i = 0; i < vertices; i++) {
			String[] tokens = scan.nextLine().split(" ");
			for (int j = 1; j < tokens.length; j++) {
				graph.addEdge(Integer.parseInt(tokens[0]),
				              Integer.parseInt(tokens[j]));
			}
		}
		System.out.println(graph);
		PageRank pageObj = new PageRank(graph);
		pageObj.add();
		System.out.println(pageObj.toString());
		// 

		// }
		// read the first line of the input to get the number of vertices

		// iterate count of vertices times
		// to read the adjacency list from std input
		// and build the graph


		// Create page rank object and pass the graph object to the constructor

		// print the page rank object

		// This part is only for the final test case

		// File path to the web content
		String file = "WebContent.txt";

		// instantiate web search object
		// and pass the page rank object and the file path to the constructor

		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky

	}
}