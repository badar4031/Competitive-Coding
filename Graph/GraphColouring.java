/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Graph{
    priate int vertices;
    LinkedList<Integer> adj[];
    Graph(int vertices){
        this.vertices =vertices ;
        adj[] = new LinkedList[vertices];
        for(int i=0;i<vertices;i++){
            adj[i] = new LinkedList();
        }
    }
    public void adjEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    public void greedyColoring(){
        int res = new int[vertices];
        boolean available[] = new boolean[vertices];
        for(int i=0;i<vertices;i++){
            res[i]=-1;
            available[i]=true;
        }
        res[0]=0;
        
        //assign colour to remaining vertices
        for(int i=1;i<vertices;i++){
            Iterator ite = adj[i].iterator();
            
            //marking the current colour unavailable for every adjacent element
            while(ite.hasNext()){
                int t = ite.next();
                if(res[t]!=-1){
                    available[res[t]]=false;
                }
            }
            int colour ;
            //checking the current available colour
            for(colour = 0;colour<vertices;colour++){
                if(available[colour])
                    break;
            }
            res[i]= colour;
        }
    }
}
public class Main
{
	// Driver method
    public static void main(String args[])
    {
        Graph g1 = new Graph(5);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);
        g1.addEdge(2, 3);
        g1.addEdge(3, 4);
        System.out.println("Coloring of graph 1");
        g1.greedyColoring();
  
        System.out.println();
        Graph g2 = new Graph(5);
        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 2);
        g2.addEdge(1, 4);
        g2.addEdge(2, 4);
        g2.addEdge(4, 3);
        System.out.println("Coloring of graph 2 ");
        g2.greedyColoring();
    }
}
