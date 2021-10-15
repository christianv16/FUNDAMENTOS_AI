import java.util.ArrayList;
import java.util.List;

public class Deep_First_Search {

    static class Node {
        String data;
        boolean visited;
        List<Node> neighbours;

        Node(String data) {
            this.data = data;
            this.neighbours = new ArrayList<>();

        }

        public void addneighbours(Node neighbourNode) {
            this.neighbours.add(neighbourNode);
        }

        public List<Node> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }
    }

    // Recursive DFS
    public void dfs(Node node) {
        System.out.print(node.data + " ");
        List<Node> neighbours = node.getNeighbours();
        node.visited = true;
        for (int i = 0; i < neighbours.size(); i++) {
            Node n = neighbours.get(i);
            if (n != null && !n.visited) {
                dfs(n);
            }
        }
    }

    // Iterative DFS using stack

    public static void main(String arg[]) {

        Node nodeS = new Node("S");
        Node nodeA = new Node("A");
        Node nodeD = new Node("D");
        Node nodeB = new Node("B");
        Node nodeE = new Node("E");
        Node nodeC = new Node("C");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeS.addneighbours(nodeA);
        nodeS.addneighbours(nodeD);
        nodeA.addneighbours(nodeS);
        nodeA.addneighbours(nodeD);
        nodeA.addneighbours(nodeB);
        nodeD.addneighbours(nodeS);
        nodeD.addneighbours(nodeA);
        nodeD.addneighbours(nodeE);
        nodeB.addneighbours(nodeA);
        nodeB.addneighbours(nodeE);
        nodeB.addneighbours(nodeC);
        nodeE.addneighbours(nodeD);
        nodeE.addneighbours(nodeB);
        nodeE.addneighbours(nodeF);
        nodeC.addneighbours(nodeB);
        nodeF.addneighbours(nodeE);
        nodeF.addneighbours(nodeG);
        nodeG.addneighbours(nodeF);

        Deep_First_Search dfsExample = new Deep_First_Search();

        // Resetting the visited flag for nodes
        nodeS.visited = false;
        nodeA.visited = false;
        nodeD.visited = false;
        nodeB.visited = false;
        nodeE.visited = false;
        nodeC.visited = false;
        nodeE.visited = false;
        nodeG.visited = false;
        nodeF.visited = false;

        System.out.println("El DFS trasversal del grafico utiliza recursion ");
        dfsExample.dfs(nodeS);
    }
}