

class Node{
        int data;
        Node left,right;
        
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        } 
}
class CountNodes{
    Node root;
    
    public int countNodes(){
        if(root == null){
            return 0;
        }
        return countNodes(root);
    }
    public int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        CountNodes tree = new CountNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(5);
  
        System.out.println(
            "Preorder traversal of binary tree is "+tree.countNodes());
       
  
    }
}

