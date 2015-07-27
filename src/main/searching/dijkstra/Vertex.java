package main.searching.dijkstra;

public class Vertex implements Comparable<Vertex> {
    
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    
    public Vertex(String n) {
        name = n;
    }
    
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(Vertex o) {
        return Double.compare(minDistance, o.minDistance);
    }
    
}