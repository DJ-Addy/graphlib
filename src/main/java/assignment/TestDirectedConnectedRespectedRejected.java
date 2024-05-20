package assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.InputStream;


import graphlib.Graph;
import graphlib.Node;
import graphlib.NodeVisitor;
import javafx.scene.canvas.GraphicsContext;

public class TestDirectedConnectedRespectedRejected {
    public static void main(String[] args) {
        try {
            // Reading the graph from the file wont work without absolute path 
            String filePath = "datafiles/graph3.txt";
            Graph graph = Graph.readUndirectedUnweightedGraph(new FileInputStream("C:\\Users\\Adam\\Desktop\\GraphLib\\graphlib\\datafiles\\graph5.txt"));
            System.out.println(graph.toUndirectedUnweightedGraphViz());
            
            
            // Calculate reachability from node "Letter"
            Graph reachableGraph = graph.Reachability(graph.getOrCreateNode("A"));
            System.out.println(reachableGraph.toUndirectedUnweightedGraphViz());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
