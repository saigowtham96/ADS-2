import java.util.Scanner;
/**.
 * Class for solution.
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * main method Time complexity  is O(E)
     * E is number of edges.
     * V for printing graph.
     * E+V for dijkstra's algorithm.
     * V for pathTo method.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int vertices = Integer.parseInt(scan.nextLine());
        int edges = Integer.parseInt(scan.nextLine());
        EdgeWeightedGraph graph = new EdgeWeightedGraph(vertices);
        for (int i = 0; i < edges; i++) {
            String[] inputs = scan.nextLine().split(" ");
            graph.addEdge(new Edge(
                            Integer.parseInt(
                                inputs[0]), Integer.parseInt(
                                inputs[1]),
                Double.parseDouble(inputs[2])));
        }
        String caseToGo = scan.nextLine();
        switch (caseToGo) {
        case "Graph":
            System.out.println(graph);
            break;
        case "DirectedPaths":
            // Handle the case of DirectedPaths, where two integers are given.
            // First is the source and second is the destination.
            // If the path exists print the distance between them.
            // Other wise print "No Path Found."
            String[] paths = scan.nextLine().split(" ");
            DijkstraSP object = new DijkstraSP(graph, Integer.parseInt(
                paths[0]));
            if (object.hasPathTo(Integer.parseInt(paths[1]))) {
                System.out.println(object.distTo(Integer.parseInt(
                    paths[1])));
            } else {
                System.out.println("No Path Found.");
            }
            break;
        case "ViaPaths":
            // Handle the case of ViaPaths, where three integers are given.
            // If the path exists print the distance between them.
            // Other wise print "No Path Found."
            String[] viaPaths = scan.nextLine().split(" ");
            DijkstraSP object1 = new DijkstraSP(graph, Integer.parseInt(
                viaPaths[0]));
            DijkstraSP object2 = new DijkstraSP(graph, Integer.parseInt(
                viaPaths[1]));
            if (object1.hasPathTo(
                Integer.parseInt(
                    viaPaths[1])) && object2.hasPathTo(
                        Integer.parseInt(viaPaths[2]))) {
                System.out.println(object1.distTo(
                                       Integer.parseInt(
                                           viaPaths[1])) + object2.distTo(
                                       Integer.parseInt(viaPaths[2])));
                System.out.println(object1.pathTo(
                                       Integer.parseInt(
                                           viaPaths[1])) + "" + object2.pathTo(
                                       Integer.parseInt(
                                           viaPaths[2])));
            } else {
                System.out.println("No Path Found.");
            }
            break;
            default:
            break;

    }
}
}




