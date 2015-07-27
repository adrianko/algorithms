package main.searching.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

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
    
}