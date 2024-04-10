package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public void addNode(N a){
        if(!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }

    @Override
    public String toString() {
        return this.adjacencyList.toString();
    }
    public boolean areConnected(N from,N to){
        return this.adjacencyList.containsKey(from) &&
                this.adjacencyList.get(from).contains(to);
    }
    public boolean validPath(ArrayList<N> path){
        for (int x=1;x<path.size();x++){
            N from=path.get(x-1);
            N to=path.get(x);
            if(!areConnected(from,to)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Graph<String> graph=new Graph();
        graph.addEdge("Rockville","Paper Airplane");
        graph.addEdge("Rockville","Back in USSR");
        graph.addEdge("Rockville","Californication");
        graph.addEdge("Rockville","Hotel California");
        graph.addEdge("Californication","Hotel California");
        graph.addEdge("No Parties LA","Hotel California");
        graph.addEdge("No Parties LA","Californication");
        graph.addEdge("Californication","No Parties LA");
        graph.addEdge("Paper Airplane","Californication");
        graph.addEdge("Back in USSR","Bicycle Race");
        graph.addEdge("Bicycle Race","Californication");
        System.out.println(graph);

        ArrayList<String> path=new ArrayList<>(Arrays.asList(
                "Rockville","Back in USSR","Bicycle Race",
                "Californication","Hotel California"
        ));
        System.out.println(graph.validPath(path));
    }
}
