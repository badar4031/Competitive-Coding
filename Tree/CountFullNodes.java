/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        } 
}
class CountFullNodes{
    Node root;
    
    public int countFullNodes(){
        if(root == null){
            return 0;
        }
        return countFullNodes(root);
    }
    public int countFullNodes(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return  countFullNodes(root.left) + countFullNodes(root.right) + ((root.left!=null) && (root.right!=null)?1:0);
    }
}

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        CountFullNodes tree = new CountFullNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(5);
  
        System.out.println(
            "Number of full Nodes = "+tree.countFullNodes());
       
  
    }
}
