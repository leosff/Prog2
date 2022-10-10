// In der Gruppe Daniel Schlesinger und Leonard Schülke entstanden
package graph;

import java.util.*;

public class Breitensuche {

    private Graph<Vertex, Edge<Vertex>> Graph;

    public Breitensuche(Graph<Vertex, Edge<Vertex>> Graph) {
        this.Graph = Graph;
    }

    public Map<Vertex, Integer> Distanz(Vertex startvertex) {
        HashMap<Vertex, Integer> distanz = new HashMap<>();                                                             // Erstellen der Hashmap für die Erfassung der Distanz
        Queue<Vertex> queue = new LinkedList<>();                                                                       // Erstellen der Queue zum Durchgehen des Graphen

        queue.add(startvertex);
        distanz.put(startvertex, 0);

        while (!queue.isEmpty()) {                                                                                      // Befüllen der Queue und hinzufügen zu Distanz
            Vertex queuewert = queue.remove();
            Collection<Edge<Vertex>> edges = Graph.getIncidentEdges(queuewert);

            for (var edge : edges) {
                Vertex vertexother = edge.getVertexA().equals(queuewert) ? edge.getVertexB() : edge.getVertexA();
                if (!distanz.containsKey(vertexother)) {
                    distanz.put(vertexother, distanz.get(queuewert) + 1);
                    queue.add(vertexother);
                }
            }
        }
        for (Vertex v : Graph.getVertices()) {
            distanz.putIfAbsent(v, Integer.MAX_VALUE);
        }
        return distanz;
    }

    public HashMap<Vertex, Vertex> Vorgaenger(Vertex startvertex) {                                                     // Methode für das Bestimmen der Vorgänger im Graphen
        HashMap<Vertex, Vertex> vorgaenger = new HashMap<>();
        Queue<Vertex> newqueue = new LinkedList<>();

        newqueue.add(startvertex);

        while (!newqueue.isEmpty()) {
            Vertex queuewert = newqueue.remove();
            Collection<Edge<Vertex>> edges = Graph.getIncidentEdges(queuewert);

            for (var edge : edges) {
                Vertex vertexother = edge.getVertexA().equals(queuewert) ? edge.getVertexB() : edge.getVertexA();
                if (!vorgaenger.containsKey(vertexother)) {
                    vorgaenger.put(vertexother, queuewert);
                    newqueue.add(vertexother);
                }
            }
        }

        for (Vertex v : Graph.getVertices()) {
            vorgaenger.putIfAbsent(v, null);
        }
        return vorgaenger;
    }

    public List<Vertex> Weg(Vertex startvertex, Vertex endvertex) {                                                     // Bestimmen des Weges vom Start- zum Zielpunkt
        List<Vertex> durchlauf = new LinkedList<Vertex>();
        HashMap<Vertex, Vertex> tempvorgaenger = Vorgaenger(startvertex);
        HashMap<Vertex, Vertex> vorgaenger = new HashMap<Vertex, Vertex>();

        for (var l : tempvorgaenger.entrySet()) if (l.getValue() != null) vorgaenger.put(l.getKey(), l.getValue());

        if (vorgaenger.containsKey(endvertex)) {
            Vertex current = endvertex;
            while (current != startvertex) {
                durchlauf.add(current);
                current = vorgaenger.get(current);
            }
            durchlauf.add(current);
            Collections.reverse(durchlauf);
        }
        return durchlauf;
    }

}
