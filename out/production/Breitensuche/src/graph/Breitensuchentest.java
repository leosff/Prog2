// In der Gruppe Daniel Schlesinger und Leonard Schülke entstanden

package graph;

public class Breitensuchentest {

    public static void main(String[] args) {
        test8undirected08();
        test8directed08();
        test8directed05();
        test8directed80();
        test20directed06();
        test20directed05();
        test8bdirected016();




    }
    public static void test8undirected08() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph8.txt", false, true, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(0));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();
        var b = bs.Vorgaenger(graph.getVertex(0));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(0), graph.getVertex(8));
        String result = "";
        for (Vertex v : c) {
            result += v + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }

    public static void test8directed08() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph8.txt", true, true, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(0));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();
        var b = bs.Vorgaenger(graph.getVertex(0));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(0), graph.getVertex(8));
        String result = "";
        for (Vertex v : c) {
            result += v + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }

    public static void test8directed05() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph8.txt", true, true, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(0));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();

        var b = bs.Vorgaenger(graph.getVertex(0));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(0), graph.getVertex(5));
        String result = "";
        for (Vertex v : c) {
            result += v + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }

    public static void test8directed80() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph8.txt", true, true, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(8));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();
        var b = bs.Vorgaenger(graph.getVertex(8));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(8), graph.getVertex(0));
        String result = "";
        for (Vertex v : c) {
            result += v + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }

    public static void test20directed06() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph20.txt", false, true, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(0));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();
        var b = bs.Vorgaenger(graph.getVertex(0));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(0), graph.getVertex(6));
        String result = "";
        for (Vertex v : c) {
            result += v + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }

    public static void test20directed05() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph20.txt", true, true, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(0));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();
        var b = bs.Vorgaenger(graph.getVertex(0));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(0), graph.getVertex(5));
        String result = "";
        for (Vertex v : c) {
            result += v + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }

    public static void test8bdirected016() {
        Graph<Vertex, Edge<Vertex>> graph = GraphRead.FileToGraph("C:\\Users\\leona\\IdeaProjects\\Breitensuche\\resource\\graph8b.txt", false, false, false);
        Breitensuche bs = new Breitensuche(graph);
        var a = bs.Distanz(graph.getVertex(0));
        for (var pair : a.entrySet()) {
            System.out.print(pair.getKey() + " " + (pair.getValue() == Integer.MAX_VALUE ? "MAXINT" : pair.getValue()) + "|");
        }
        System.out.println();
        var b = bs.Vorgaenger(graph.getVertex(0));
        for (var pair : b.entrySet()) {
            System.out.print(pair.getKey() + " " + pair.getValue()+ "|");
        }
        System.out.println();
        var c = bs.Weg(graph.getVertex(0), graph.getVertex(16));
        String result = "";
        for (Vertex v : c) {
            result += v.getId() + ",";
        }
        if(result.length() > 1){
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }else System.out.println("existiert nicht");
        System.out.println();
    }
}
