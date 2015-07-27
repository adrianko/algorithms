package main.searching.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Dijkstra's algorithm - a graph algorithm that finds the shortest path from a single vertex in a weighted graph to all 
 * other vertices in the graph. Works for directed and undirected graphs, but requires non-negative edge weights.
 */
public class Dijkstra {
    
    public static void computePaths(Vertex source) {
        source.minDistance = 0;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(source);
        
        while (!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();
            
            for (Edge e : u.adjacencies) {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);
                    v.minDistance = distanceThroughU;
                    v.previous = u;
                    vertexQueue.add(v);
                }
            }
        }
    }
    
    public static List<Vertex> getShortestPathTo(Vertex target) {
        List<Vertex> path =  new ArrayList<>();
        
        for (Vertex v = target; v != null; v = v.previous) {
            path.add(v);
        }

        Collections.reverse(path);
        
        return path;
    }
    
    public static void main(String[] args) {
        Vertex v0 = new Vertex("London");
        Vertex v1 = new Vertex("Birmingham");
        Vertex v2 = new Vertex("Bristol");
        Vertex v3 = new Vertex("Oxford");
        Vertex v4 = new Vertex("Cambridge");
        Vertex v5 = new Vertex("Southampton");
        Vertex v6 = new Vertex("Portsmouth");

        v0.adjacencies = new Edge[]{new Edge(v1, 79.83), new Edge(v5, 81.15)};
        v1.adjacencies = new Edge[]{new Edge(v0, 79.75), new Edge(v2, 39.42), new Edge(v3, 103.00)};
        v2.adjacencies = new Edge[]{new Edge(v1, 38.65)};
        v3.adjacencies = new Edge[]{new Edge(v1, 102.53), new Edge(v5, 61.44), new Edge(v6, 96.79)};
        v4.adjacencies = new Edge[]{new Edge(v5, 133.04)};
        v5.adjacencies = new Edge[]{new Edge(v0, 81.77), new Edge(v3, 62.05), new Edge(v4,134.47), new Edge(v6, 91.63)};
        v6.adjacencies = new Edge[]{new Edge(v3, 97.24), new Edge(v5, 87.94)};
        
        Vertex[] vertices = { v0, v1, v2, v3, v4, v5, v6 };
        computePaths(v0);
        
        for (Vertex v : vertices) {
            System.out.println("Distance to " + v + ": " + v.minDistance);
            System.out.println("Path: " + getShortestPathTo(v));
        }
    }
    
}