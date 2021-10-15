import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Búsqueda Primero en Anchura (BFS).
Se expanden todos los nodos a una nivel en el árbol de búsqueda antes de expandir cualquier nodo
del próximo nivel.
Se puede implementar utilizando una cola primero en entrar primero en salir (FIFO)
Llamada también Breadth-First Search (BFS) */

public class Breadth_First_Search {

    private Queue<Node> queue;
    static ArrayList<Node> nodes = new ArrayList<Node>();

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

    public Breadth_First_Search() {
        queue = new LinkedList<Node>();
    }

    public void bfs(Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {

            Node element = queue.remove();
            System.out.print(element.data + " ");
            List<Node> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;

                }
            }

        }
    }

    public static void main(String arg[]) {

        Node nodeS = new Node("S");
        Node nodeA = new Node("A");
        Node nodeD = new Node("D");
        Node nodeB = new Node("B");
        Node nodeE = new Node("E");
        Node nodeC = new Node("C");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeS.addneighbours(nodeD);
        nodeS.addneighbours(nodeA);
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

        System.out.println("The Breadth-First Search  traversal of the graph is ");
        Breadth_First_Search bfsExample = new Breadth_First_Search();
        bfsExample.bfs(nodeS);

    }
}