package org.Algos.Graph.Algorithms;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DjikstraAlgorithm {

    public static void main(String[] args) {
        int n = 6;
        int src = 0;
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>(n);  //Adjancency List

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges
        adj.get(0).add(new int[]{4, 2});
        adj.get(0).add(new int[]{4, 1});

        adj.get(1).add(new int[]{2, 2});
        adj.get(1).add(new int[]{4, 0});

        adj.get(2).add(new int[]{4, 0});
        adj.get(2).add(new int[]{2, 1});
        adj.get(2).add(new int[]{3, 3});
        adj.get(2).add(new int[]{6, 5});
        adj.get(2).add(new int[]{1, 4});

        adj.get(3).add(new int[]{3, 2});
        adj.get(3).add(new int[]{2, 5});

        adj.get(4).add(new int[]{1, 2});
        adj.get(4).add(new int[]{3, 5});

        adj.get(5).add(new int[]{2, 3});
        adj.get(5).add(new int[]{6, 2});
        adj.get(5).add(new int[]{3, 4});


        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance); //MinHeap
        int [] dist = new int[n]; //distance array
        for(int i =0; i< n;i++){
            dist[i] = (int) 1e9; //1e9 or Integer.MAX_VALUE
        }

        dist[src] = 0;
        pq.offer(new Pair(0,src)); //offer or add are same things it's just offer doesn't return an exception

        while(!pq.isEmpty()){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            for(int i = 0;i<adj.get(node).size();i++){
            
                int adjNode = adj.get(node).get(i)[1];
                int edgeWeight = adj.get(node).get(i)[0];

                if(dis + edgeWeight < dist[adjNode] ){
                    //if our current distance is smaller than previously recorded distane, then only update the distane and push it into the queue.
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode],adjNode)); //add can also be used
                }
            }
        }




        // Printing adjacency list
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int[] edge : adj.get(i)) {
                System.out.print("(" + edge[0] + ", " + edge[1] + ") ");
            }
            System.out.println();
        }

        
        System.out.println();
        //print the distance array
        for(int i = 0;i<n;i++){
            System.out.print(dist[i] + " ");
        }
    }
}

class Pair {

    //Pair in java using classes and constructor
    int distance;
    int node;
    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}
