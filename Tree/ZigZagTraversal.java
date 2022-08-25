/*************************************************************************************************
 
 Given a binary tree, populate an arrayin zig-zag fashion using level-by-level traversal.
 You should populate the values of all nodes of each level from its seperate sub arrays.
 
 *************************************************************************************************/

import java.util.*;
class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        } 
}
class ZigZagTraversal{
    Node root;
    public ArrayList<ArrayList<Integer>>  traverse(){
       return traverse(root); 
    }
    public ArrayList<ArrayList<Integer>> traverse(Node root){
        ArrayList<ArrayList<Integer>> bfs = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return bfs;
        }
        boolean left =true;
        Queue<Node> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            
            int lvlSize = q.size();
            ArrayList<Integer> currLvl = new ArrayList<>();
            for(int i=0;i<lvlSize;i++){
                Node curr = q.poll();
                if(left)
                    currLvl.add(curr.data);
                else
                    currLvl.add(0,curr.data);
                if(curr.left != null)
                    q.offer(curr.left);
                if(curr.right != null)
                    q.offer(curr.right);
            }
            bfs.add(currLvl);
            left = !left;
        }
        return bfs;
    }
}

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        ZigZagTraversal tree = new ZigZagTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ans = tree.traverse();
        
        System.out.println(ans);
       
  
    }
}
