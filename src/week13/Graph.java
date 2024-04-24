package week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<Edge<N>>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(Edge<N> edge){
        N from=edge.getStart();
        N to=edge.getEnd();
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(edge);
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
        if(this.adjacencyList.containsKey(from))
            for (Edge edge : this.adjacencyList.get(from))
                if(edge.getEnd().equals(to))
                    return true;

        return false;
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
    public double costOfPath(ArrayList<N> path,Cost findCost){
        if  (validPath(path)){
            double cost=0;
            for (int x=1;x<path.size();x++) {
                N from = path.get(x - 1);
                N to = path.get(x);
                for (Edge edge : this.adjacencyList.get(from))
                    if(edge.getEnd().equals(to))
                        cost+=findCost.cost(edge);
            }
            return cost;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Graph<String> graph=new Graph();
        ArrayList<Edge<String>> flights=new ArrayList<>();
        flights.add(new Flight<>("BUF","LAX",450,2965,6));
        flights.add(new Flight<>("BUF","TOR",174,100,1));
        flights.add(new Flight<>("TOR","BUF",250,160,1));
        flights.add(new Flight<>("LAX","MIA",300,3100,7));
        flights.add(new Flight<>("MIA","WDC",95,800,3));
        flights.add(new Flight<>("WDC","BUF",2174,300,5));
        for (Edge<String> edge : flights){
            graph.addEdge(edge);
        }
        System.out.println(graph);

        ArrayList<String> path=new ArrayList<>(Arrays.asList(
                "BUF","LAX","MIA", "WDC"
        ));
        System.out.println(graph.validPath(path));
        //FlightDistance dist=new FlightDistance();
        FlightPrice dist=new FlightPrice();
        double distPath= graph.costOfPath(path,dist);
        System.out.println(distPath);
    }
}
