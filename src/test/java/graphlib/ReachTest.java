package src;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import graphlib.Graph;

public class ReachTest {
    //Write a Junit test for the method reachability in graphlib and test it with the graph5.txt file
    @Test
    public void testReachability() throws IOException {
        Graph graph = new Graph();
        InputStream inputStream = getClass().getResourceAsStream("/graph5.txt");
        graph.loadGraph(inputStream);
        
        boolean result = graph.Reachability();
        
        assertTrue(result);
    }


}
